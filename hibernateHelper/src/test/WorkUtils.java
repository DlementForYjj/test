package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import test.io.IOUtil;
import test.table.TableUtil;

public class WorkUtils {

	
	public static void main(String[] args) {
		
		List<String> lines = IOUtil.readFileList("D:\\javaio\\test.txt");
		List<Object[]> options = new ArrayList<>();
		for(String line : lines){
			
			String[] lineInfos = line.split("\t+");
			
			options.add(new Object[]{lineInfos[2],lineInfos[4]});
			
		}
		createCodeSql("CFJG", "处分结果", options);
	}
	
	/**
	 * 
	 * @param typeId
	 * @param codeName
	 * @param options 
	 */
	public static void createCodeSql(String typeId,String typeName,List<Object[]> options){
		
		String pubCodeTypeSql = "INSERT INTO PUB_CODE_TYPE(TYPE_ID,TYPE_NAME) VALUES('"+typeId+"','"+typeName+"');";
		System.out.println(pubCodeTypeSql);
		int order = 0;
		for(Object[] o :options){
			String codeValue = (String) o[0];
			String codeName = (String) o[1];
			String pubCodeSql = "INSERT INTO PUB_CODE(TYPE_ID,CODE_VALUE,CODE_NAME,CODE_ORDER,FLAG) VALUES('"+typeId+"','"+codeValue+"','"+codeName+"','"+String.valueOf(order*10)+"','0');";
			System.out.println(pubCodeSql);
			order++;
		}
		
	}
	
	public void findDWTable(){
		String path = "D:\\javaio\\table";
		List<String> fileNames = IOUtil.findSubFileNames(path);
		Map<String,List<String>> map = new HashMap<>();
		
		for(String fileName:fileNames){
			List<String> colNames = new ArrayList<>();
			String tableName = fileName.split(",")[0];
			String content = IOUtil.readFile(path+"\\"+fileName);
			String columnContent = TableUtil.getAreaContent(content, "");
			String[] columnInfos = columnContent.split(",");
			for(String columnInfo:columnInfos){
				String infoStr = columnInfo.replaceFirst("\\s+", "");
				String[] infos = infoStr.split("\\s+");
				colNames.add(infos[0]);
			}
			map.put(tableName, colNames);
		}
		List<String> list =  map.get("d01.tab");
		Set<String> s = new HashSet<>();
		for(String l : list){
			if(l.substring(0,3).startsWith("e03")||l.substring(0,3).startsWith("e02")){
				s.add(l);
			}
		}
		System.out.println(s);
	}
	
}
