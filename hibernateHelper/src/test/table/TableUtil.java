package test.table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	/***************************关键的工具 start******************************************/
	/**
	 * 读取表中的字段备注映射关系，这里只处理了理想状态下的sql
	 * NOTED BY @autor YJJ @date 2017年6月30日
	 */
	public static List<ColInfo> findColInfos(String input){
		
		List<ColInfo> colInfos = new ArrayList<>();
		String colContent = TableUtil.getAreaContent(input, "");
		Map<String,String> remarkMap = findColRemarks(input);
		
		String[] columnInfos = colContent.split(",");
		for (String columnInfo : columnInfos) {
			String infoStr = columnInfo.replaceFirst("\\s+", "");
			boolean notNull = infoStr.indexOf("not null")!=-1;
			String[] infos = infoStr.split("\\s+");
			//FIXME 使用逗号切割不是很合理，有的类型里面是有逗号的
			if(infos.length<=1){
				continue;
			}
			String colName = infos[0];
			String colType = infos[1];
			
			
			ColInfo colInfo = new ColInfo();
			colInfo.setColName(colName);
			colInfo.setColRemark(remarkMap.get(colName)!=null?remarkMap.get(colName):"");
			colInfo.setNotNull(notNull);
			colInfo.setColType(colType);
			
			colInfos.add(colInfo);
		}
		
		
		return colInfos;
		
	}
	/**
	 * 读取表中的字段备注映射关系，这里只处理了理想状态下的sql
	 * NOTED BY @autor YJJ @date 2017年6月30日
	 */
	public static void fillColInfos(String input,TableInfo table){
		
		String colContent = TableUtil.getAreaContent(input, "");
		Map<String,String> remarkMap = findColRemarks(input);
		
		String[] columnInfos = colContent.split(",");
		for (String columnInfo : columnInfos) {
			String infoStr = columnInfo.replaceFirst("\\s+", "");
			boolean notNull = infoStr.indexOf("not null")!=-1;
			String[] infos = infoStr.split("\\s+");
			//FIXME 使用逗号切割不是很合理，有的类型里面是有逗号的
			if(infos.length<=1){
				continue;
			}
			String colName = infos[0];
			String colType = infos[1];
			
			
			ColInfo colInfo = new ColInfo();
			colInfo.setColName(colName);
			colInfo.setColRemark(remarkMap.get(colName)!=null?remarkMap.get(colName):"");
			colInfo.setNotNull(notNull);
			colInfo.setColType(colType);
			
			table.addCol(colInfo);
		}
		
		
		
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
	
	
	/**
	 * 读取表中的字段备注映射关系，这里只处理了理想状态下的sql
	 * NOTED BY @autor YJJ @date 2017年6月30日
	 */
	public static Map<String,String> findColRemarks(String input){
		//FIXME 这边可以使用正则去优化，建议不要使用list，而只需要string 就能够匹配，把所有行元素进行整合
//		comment on column PUB_CODE.type_id is '类别';
		Map<String,String> map = new HashMap<>();
		
		String regex = "comment on column (.+?) is (.+?);";
		Matcher m = Pattern.compile(regex).matcher(input);
		while(m.find()){
			if(m.groupCount()>=2){
				String[] tableDotCol = m.group(1).split("\\.");
				String tableName = tableDotCol[0];
				String colName = tableDotCol[1];
				String remark = m.group(2);
				map.put(colName, remark);
			}
			
		}
		
		
		return map;
	}

	
	
	/*************************关键的工具 end***********************************/
	
	
	
	/**
	 * 利用注释来显示信息,用于党统系统，找出特殊的开头
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
		String input = IOUtil.readFile(fileName);
		String[] columnInfos = getAreaContent(input, "create table").split(",");
		for(String info:columnInfos){
			info = info.replaceFirst("\\s+","");
			result.add(info.split("\\s+")[0]);
		}
		return result;
	}
	
	
	
	
	
}
