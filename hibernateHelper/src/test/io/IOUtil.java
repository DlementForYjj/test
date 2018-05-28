package test.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.Charsets;

import antlr.Utils;
import test.table.ColInfo;
import test.table.TableInfo;
import test.table.TableUtil;

public class IOUtil {

	public static String FILE_CHARSET = "gbk";
	
	public static void main(String[] args) {
		List<String> lines = readFileList("D:\\javaio\\test.txt");
		for(String line:lines){
			
			System.out.println("select count(1) from pub_organize t where t.org_code like '"+line+"%';");
		
		}
		
		
		
//		Map<String,List<String>> colMap = readDBTable("D:\\javaio\\table");
//		List<String> cols = colMap.get("mem_tran");
//		String s = "(";
//		for(String col:cols){
////			s+=",'"+col+"'";
//			s+=","+col;
//		}
//		s+=")";
//		System.out.println(s);
	}
	
	public static String readFile(String pathname){
		StringBuilder sb = new StringBuilder();
		
		try {
//			InputStream is = new FileInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathname)),FILE_CHARSET));
			int i;
			while((i = br.read())!=-1){
				sb.append((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//FIXME 这边关闭流尚未完成，将就使用
			
		}
		return sb.toString();
	}
	/**
	 * 这个方法主要是把file里面的内容连成一句
	 * NOTED BY @autor YJJ @date 2017年7月3日
	 */
	public static String readFileToString(String pathname){
		StringBuilder sb = new StringBuilder();
		
		try {
//			InputStream is = new FileInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathname)),FILE_CHARSET));
			String s;
			while((s = br.readLine())!=null){
				sb.append(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//FIXME 这边关闭流尚未完成，将就使用
			
		}
		return sb.toString();
	}
	
	public static List<String> readFileList(String pathname){
		List<String> result = new ArrayList<>();
		try {
//			InputStream is = new FileInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathname)),FILE_CHARSET));
			String line;
			while((line = br.readLine())!=null){
				result.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//FIXME 这边关闭流尚未完成，将就使用
			
		}
		
		return result;
	}
	
	public static void outputFile(String pathname,String outputString){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File(pathname)),FILE_CHARSET);
			osw.write(outputString);
			osw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//FIXME 这边关闭流尚未完成，将就使用
			
		}
		
		
	}
	
	public static List<String> findSubFileNames(String path){
		List<String> result = new ArrayList<>();
		File fileDir=new File(path);
		File[] files = fileDir.listFiles();
		for(File file:files){
			result.add(file.getName());
		}
//		Collections.sort(result);
		return result;
	}
	
	
	
	/**
	 * 将数据库的建表语句批量导出，放在一个文件夹下面，这个方法可以他们转换成   表 和 列 映射关系
	 * NOTED BY @autor YJJ @date 2017年6月26日
	 */
	public static Map<String,List<String>> readDBTable(String path){
		List<String> fileNames = IOUtil.findSubFileNames(path);
		Map<String, List<String>> map = new HashMap<>();
		
		for (String fileName : fileNames) {
			if (".tab".equals(fileName.substring(fileName.lastIndexOf(".")))) {
				List<String> colNames = new ArrayList<>();
				String tableName = fileName.split("\\.")[0];
				String content = IOUtil.readFile(path + "\\" + fileName);
				String columnContent = TableUtil.getAreaContent(content, "");
				String[] columnInfos = columnContent.split(",");
				for (String columnInfo : columnInfos) {
					String infoStr = columnInfo.replaceFirst("\\s+", "");
					String[] infos = infoStr.split("\\s+");
					colNames.add(infos[0]);
				}

				map.put(tableName, colNames);
			}
		}

		return map;
		
	}
	/**
	 * 将数据库的建表语句批量导出，放在一个文件夹下面，这个方法可以他们转换成   表 和 列 映射关系
	 * NOTED BY @autor YJJ @date 2017年6月26日
	 */
	public static List<TableInfo> readDBTableInfo(String path){
		List<TableInfo> tableInfos = new ArrayList<>();
		List<String> fileNames = IOUtil.findSubFileNames(path);
		
		for (String fileName : fileNames) {
			if (".tab".equals(fileName.substring(fileName.lastIndexOf(".")))) {
				String tableName = fileName.split("\\.")[0];
				TableInfo table = new TableInfo();
				table.setTableName(tableName);
				String tableContent = IOUtil.readFile(path + "\\" + fileName);
				TableUtil.fillColInfos(tableContent, table);
				TableUtil.fillTablePrimaryKeyList(IOUtil.readFileList(path + "\\" + fileName), table);
				TableUtil.fillTableIndexList(IOUtil.readFileList(path + "\\" + fileName), table);
				tableInfos.add(table);
			}
		}

		return tableInfos;
		
	}
	/**
	 * 将数据库的建表语句批量导出，放在一个文件夹下面，这个方法可以他们转换成   表 和 列 映射关系
	 * NOTED BY @autor YJJ @date 2017年6月26日
	 */
	public static Map<String,TableInfo> readDBTableInfoMap(String path){
		List<TableInfo> tableInfos = readDBTableInfo(path);
		Map<String,TableInfo> map = new HashMap<>();
		for(TableInfo t:tableInfos){
			map.put(t.getTableName(), t);
		}
		return map;
	}
	
}
