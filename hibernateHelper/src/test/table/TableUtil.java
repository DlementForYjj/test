package test.table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.io.IOUtil;

public class TableUtil {

	
	public static void main(String[] args) {
		String path = "D:\\javaio\\table";
		List<String> fileNames = IOUtil.findSubFileNames(path);
		Map<String,List<String>> map = new HashMap<>();
		
		for(String fileName:fileNames){
			List<String> colNames = new ArrayList<>();
			String tableName = fileName.split(",")[0];
			String content = IOUtil.readFile(path+"\\"+fileName);
			String columnContent = getAreaContent(content, "");
			String[] columnInfos = columnContent.split(",");
			for(String columnInfo:columnInfos){
				String infoStr = columnInfo.replaceFirst("\\s+", "");
				String[] infos = infoStr.split("\\s+");
				colNames.add(infos[0]);
			}
			map.put(tableName, colNames);
		}
	}
	
	
	
	/**
	 * 利用注释来显示信息,没有注释的将不会显示
	 * NOTED BY @autor YJJ @date 2017年6月26日
	 */
	public static void prinfTableInfo(String path,String tableStart){
		
		List<String> list =  IOUtil.readFileList(path);
		Map<String,String> map = new HashMap<>();
		String key = "";
		String value = "";
		for(String s:list){
			s = s.trim();
			if(s.startsWith("comm")){
				key = s.split(" ")[3];
				key = key.substring(4);
			}else if(s.startsWith("is")){
				value = s.split(" ")[1];
				map.put(key, value);
			}
		}
		for(String s:list){
			s = s.trim();
			if(s.startsWith(tableStart)){
				System.out.println(s.substring(0, 7).trim()+":"+map.get(s.substring(0, 7).trim()));
			}
		}
		
	}
	
	public static List<String> findTableColumns(String fileName){
		List<String> result = new ArrayList<>();
		String input = IOUtil.readFileToString("D:/javaio/test.txt");
		String[] columnInfos = getAreaContent(input, "create table").split(",");
		for(String info:columnInfos){
			info = info.replaceFirst("\\s+","");
			result.add(info.split("\\s+")[0]);
		}
		return result;
	}
	
	
	/**
	 * 截取目标域里面的内容
	 * NOTED BY @autor YJJ @date 2017年6月26日
	 */
	public static String getAreaContent(String input,String areaName){
		
		
		
		String result = "";
		if("".equals(areaName)||areaName!=null){
			result = input.substring(input.indexOf(areaName));
		}else{
			result = input;
		}
		
		int flag = 0;
		boolean isFirst = true;
		int endIndex = -1;
		for (int i = 0; i < result.length(); i++) {
			if (flag == 0 && !isFirst) {
				break;
			}
			if ("(".equals(String.valueOf(result.charAt(i)))) {
				flag--;
				isFirst = false;
			} else if (")".equals(String.valueOf(result.charAt(i)))) {
				flag++;
				endIndex = i;
				isFirst = false;
			}

		}
		if(endIndex!=-1){
			return result.substring(result.indexOf("(") + 1, endIndex);
		}else{
			return "";
		}
		
	}
	
	
}
