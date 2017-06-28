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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.Charsets;

import test.table.TableUtil;

public class IOUtil {

	public static String FILE_CHARSET = "gb2312";
	
	public static void main(String[] args) {
		String error1 = readFile("D:\\javaio\\error1.txt");
		String error2 = readFile("D:\\javaio\\error2.txt");
		System.out.println(error1.split(",").length);
		System.out.println(error2.split(",").length);
		Set<String> set = new HashSet<>();
		for(String s:error1.split(",")){
			set.add(s);
		}
		for(String s:error2.split(",")){
			set.add(s);
		}
		System.out.println(set.size());
		
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
	
	
	
}
