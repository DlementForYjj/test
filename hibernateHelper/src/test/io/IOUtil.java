package test.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.table.TableInfo;
import test.table.TableUtil;
import test.util.CalMap;

public class IOUtil {

	public static String FILE_CHARSET = "gbk";
	
	public static void main(String[] args) {
		
		CalMap cMap = new CalMap();
		cMap.put("1", 3);
		cMap.put("1", 3);
		System.out.println(cMap.get("1"));
		System.out.println(cMap.get("2"));
		
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
		}finally{//FIXME 杩欒竟鍏抽棴娴佸皻鏈畬鎴愶紝灏嗗氨浣跨敤
			
		}
		return sb.toString();
	}
	/**
	 * 杩欎釜鏂规硶涓昏鏄妸file閲岄潰鐨勫唴瀹硅繛鎴愪竴鍙�
	 * NOTED BY @autor YJJ @date 2017骞�7鏈�3鏃�
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
		}finally{//FIXME 杩欒竟鍏抽棴娴佸皻鏈畬鎴愶紝灏嗗氨浣跨敤
			
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
		}finally{//FIXME 杩欒竟鍏抽棴娴佸皻鏈畬鎴愶紝灏嗗氨浣跨敤
			
		}
		
		return result;
	}
	public static void outPutFileList(List<String> printList,String pathname){
		StringBuilder sb = new StringBuilder(); 
		for(String printS : printList){
			sb.append(printS+"\r\n");
		}
		outputFile(pathname, sb.toString());
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
		}finally{//FIXME 杩欒竟鍏抽棴娴佸皻鏈畬鎴愶紝灏嗗氨浣跨敤
			
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
	 * 灏嗘暟鎹簱鐨勫缓琛ㄨ鍙ユ壒閲忓鍑猴紝鏀惧湪涓�涓枃浠跺す涓嬮潰锛岃繖涓柟娉曞彲浠ヤ粬浠浆鎹㈡垚   琛� 鍜� 鍒� 鏄犲皠鍏崇郴
	 * NOTED BY @autor YJJ @date 2017骞�6鏈�26鏃�
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
	 * 灏嗘暟鎹簱鐨勫缓琛ㄨ鍙ユ壒閲忓鍑猴紝鏀惧湪涓�涓枃浠跺す涓嬮潰锛岃繖涓柟娉曞彲浠ヤ粬浠浆鎹㈡垚   琛� 鍜� 鍒� 鏄犲皠鍏崇郴
	 * NOTED BY @autor YJJ @date 2017骞�6鏈�26鏃�
	 */
	public static List<TableInfo> readDBTableInfo(String path){
		return readDBTableInfo(path,"");
	}
	
	
	/**
	 * 灏嗘暟鎹簱鐨勫缓琛ㄨ鍙ユ壒閲忓鍑猴紝鏀惧湪涓�涓枃浠跺す涓嬮潰锛岃繖涓柟娉曞彲浠ヤ粬浠浆鎹㈡垚   琛� 鍜� 鍒� 鏄犲皠鍏崇郴
	 * NOTED BY @autor YJJ @date 2017骞�6鏈�26鏃�
	 */
	public static List<TableInfo> readDBTableInfo(String path,String regex){
		List<TableInfo> tableInfos = new ArrayList<>();
		List<String> fileNames = IOUtil.findSubFileNames(path);
		
		for (String fileName : fileNames) {
			if (".tab".equals(fileName.substring(fileName.lastIndexOf(".")))) {
				String tableName = fileName.split("\\.")[0];
				TableInfo table = new TableInfo();
				table.setTableName(tableName);
				table.setColNameRegex(regex);
				String tableContent = IOUtil.readFile(path + "\\" + fileName);
				TableUtil.fillTableCols(tableContent, table);
				TableUtil.fillTablePrimaryKeyList(IOUtil.readFileList(path + "\\" + fileName), table);
				TableUtil.fillTableIndexList(IOUtil.readFileList(path + "\\" + fileName), table);
				tableInfos.add(table);
			}
		}

		return tableInfos;
	}
	/**
	 * 灏嗘暟鎹簱鐨勫缓琛ㄨ鍙ユ壒閲忓鍑猴紝鏀惧湪涓�涓枃浠跺す涓嬮潰锛岃繖涓柟娉曞彲浠ヤ粬浠浆鎹㈡垚   琛� 鍜� 鍒� 鏄犲皠鍏崇郴
	 * NOTED BY @autor YJJ @date 2017骞�6鏈�26鏃�
	 */
	public static Map<String,TableInfo> readDBTableInfoMap(String path){
		return readDBTableInfoMap(path,"");
	}
	/**
	 * 灏嗘暟鎹簱鐨勫缓琛ㄨ鍙ユ壒閲忓鍑猴紝鏀惧湪涓�涓枃浠跺す涓嬮潰锛岃繖涓柟娉曞彲浠ヤ粬浠浆鎹㈡垚   琛� 鍜� 鍒� 鏄犲皠鍏崇郴
	 * NOTED BY @autor YJJ @date 2017骞�6鏈�26鏃�
	 */
	public static Map<String,TableInfo> readDBTableInfoMap(String path,String regex){
		List<TableInfo> tableInfos = readDBTableInfo(path,regex);
		Map<String,TableInfo> map = new HashMap<>();
		for(TableInfo t:tableInfos){
			map.put(t.getTableName(), t);
		}
		return map;
	}
	
	public static List<String> readSqlToList(String filePath) {
		List<String> allSqls = new ArrayList<>();
		List<String> fileNames =  IOUtil.findSubFileNames(filePath);
		List<String> sqlFileNames = new ArrayList<>();
		for(String fileName :fileNames) {
			if(fileName.endsWith(".sql")) {
				sqlFileNames.add(fileName);
			}
		}
		for(String sqlFile : sqlFileNames) {
			boolean needStart = true;
			List<String> sqls = IOUtil.readFileList(filePath+"\\"+sqlFile);
			String sql = "";
			for(String s : sqls) {
				if(needStart) {
					if(!s.startsWith("insert")) {
						continue;
					}
					
					needStart = false;
				}
				sql+=s;
				if(s.endsWith(";")) {
					allSqls.add(sql);
					sql ="";
					needStart = true;
				}
			}
			
		}
		
		return allSqls;
	}
}
