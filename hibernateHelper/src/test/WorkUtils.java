package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import test.io.IOUtil;
import test.table.TableUtil;

public class WorkUtils {
	public static String filePath = "D:\\javaio\\";
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println("FROM FlowRecordMessage t WHERE EXISTS(SELECT t1.taskId FlowRecordMessage t1 WHERE t1.taskId=? AND t1.messageParent= t.messageParent) ORDER BY t.createTime ASC".substring(80));
	}
	
	
	
	public static List<String> readFileList(String fileName){
		return IOUtil.readFileList(filePath+fileName);
	}
	
	
	/**
	 * 
	 * @param typeId
	 * @param codeName
	 * @param options 
	 */
	public static void createCodeSql(String typeId,String typeName){
		
		List<String> lines = IOUtil.readFileList("D:\\javaio\\code.txt");
		List<String[]> options = new ArrayList<>();
		for(String line : lines){
			
			String[] lineInfos = line.split("\t+");
			
			options.add(new String[]{lineInfos[0],lineInfos[1]});
			
		}
		List<String> flagList = new ArrayList<>();
		for(String[] option:options){
			String keyP = option[0];
			for(String[] optionTemp:options){
				String keyT = optionTemp[0];
				if(keyT.startsWith(keyP)&&!keyT.equals(keyP)){
					flagList.add(keyP);
				}
			}
			
		}
		
		
		String pubCodeTypeSql = "INSERT INTO PUB_CODE_TYPE(TYPE_ID,TYPE_NAME) VALUES('"+typeId+"','"+typeName+"');";
		System.out.println(pubCodeTypeSql);
		int order = 0;
		for(Object[] o :options){
			String codeValue = (String) o[0];
			String codeName = (String) o[1];
			String flag = flagList.contains(codeValue)?"1":"0";
			String pubCodeSql = "INSERT INTO PUB_CODE(TYPE_ID,CODE_VALUE,CODE_NAME,CODE_ORDER,FLAG) VALUES('"+typeId+"','"+codeValue+"','"+codeName+"','"+String.valueOf(order*10)+"','"+flag+"');";
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
	
	public static void createUser(int count){
		for(int i = 1;i<=count;i++){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String s = sdf.format(new java.util.Date());
		long idCardStart = Long.parseLong("350102"+s+"4000");
			System.out.print("导入测试"+i+"\t"+String.valueOf(idCardStart+i)+"\t"+"999321\n");
		}
		
	}
	
	
	public static final String areacode = "11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65,71,81,82,91,";
	public static boolean isIdCard(String idCard){
		boolean isIdCard = false;
		
		//判断区域编码有没有错
		String code = idCard.substring(0,2);
		if(!areacode.contains(code)){
			return false;
		}
		//检测年月日有没有问题
		int yearNo = 0;
		if(idCard.length()==15){
			yearNo = 1900 + Integer.parseInt(idCard.substring(7, 10));
			String regex = "";
			if(yearNo%400==0|| (yearNo%100!=0&&yearNo%4==0)){//是否是闰年
				regex = "^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$";
			}else{
				regex = "'^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}$";
			}
			return idCard.matches(regex); 
		}else if(idCard.length()==18){
			yearNo = Integer.parseInt(idCard.substring(6, 10));
			String regex = "";
			if(yearNo%400==0|| (yearNo%100!=0&&yearNo%4==0)){
				regex = "^[1-9][0-9]{5}(19|20)[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}[0-9Xx]$";
			}else{
				regex = "^[1-9][0-9]{5}(19|20)[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}[0-9Xx]$";
			}
			if(!idCard.matches(regex)){
				return false;
			}else{
					idCard = idCard.toUpperCase();
					Long.parseLong(idCard.substring(0, 17)); // 前17位纯数字判断
					
					char realLastChar = idCard.charAt(17);
					// 最后一位
					char[] lastArray = new char[]{ '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
					int count = 0;
					// 前17位系数
					int[] coefArray = new int[]{ 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
					int index = 0;
					for (; index < coefArray.length; index++) {
						char ch = idCard.charAt(index);
						int num = Integer.parseInt(String.valueOf(ch));
						int coef = coefArray[index];
						count += num * coef;
					}
					char lastChar = lastArray[count % 11];
					if (lastChar == realLastChar) { // 先通过系数判断最后一位是否正确
						return true;
					}
			}
		}
		
		
		return isIdCard;
	}
}
