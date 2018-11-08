package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import test.io.IOUtil;
import test.table.ColInfo;
import test.table.TableInfo;
import test.table.TableUtil;

public class WorkUtils {
	public static String FILE_PATH = "D:\\javaio\\";
	public static String FILE_TABLE_PATH = "D:\\javaio\\table\\";
	
	public static void main(String[] args) {
		 
		//
		List<String> sqls = IOUtil.readSqlToList("D:\\javaio\\table\\insert");
		System.out.println(sqls.size());
		
		
		StringBuilder sqlString = new StringBuilder();
		
		List<String> subSqlList = sqls.subList(0, 500);
		for(String sql : subSqlList) {
			sqlString.append(sql+"\n");
		}
		
		IOUtil.outputFile(FILE_PATH+"outInsert.txt", sqlString.toString());
		
		
		
		
		
		
		
		
		
		
//		String[] removeList = new String[] {"350103197409104937","350127195908096179","350127196007280010","350203197606069013","350321198904147019","350524199010295543","350723198210172513","350781198110030431","350783198603251518","350802198601200044","352101196610210824","35210119661226181X","352101196901253015","352102197811260415","352128196308080037","352128197812180015","352201198501031629","352202196912270111","352202197109190512","352202197712032033","352202198303210032","352202198410161037","352202198608192066","35220219870524004X","35220219870809421X","352202198804053039","352225196804190020","352225197501130527","352225198507143059","352226196206260013","352226196210270011","35222619640926003X","35222619670930054X","352226196911170013","352226197011090012","352226197202132529","352226197206260536","352226197312120553","352227197511130558","352230196405110012","352230196510150016","352230196510292110","35223019660410001X","35223019660813003X","352230196702190039","352230197211242118","352230197610242115","352230199005101874","35223119640521001X"};		
//		String filePath = FILE_PATH+"zfsm\\";
		
//		List<String> allSqls = IOUtil.readSqlToList(filePath);
//		List<String> containIdCards = new ArrayList<>();
//		StringBuilder sb = new StringBuilder();
//		for(String sql:allSqls) {
//			boolean contain = false;
//			for(String remove : removeList) {
//				if(sql.contains(remove)) {
//					contain = true;
//					break;
//				}
//			}
////			boolean  ct  =false;
////			for(String idCard : idCards) {
////				
////				if(sql.contains(idCard)) {
////					ct= true;
////					containIdCards.add(idCard);
////					break;
////				}
////			}
////			
////			if(!ct) {
////				System.out.println(sql);
////			}
//			
//			if(!contain&&!sql.contains("UNDEFINED")) {
//				sql = sql.replaceAll(", ORG_NAME", "");
//				sql = RegexUtils.replaceEnd(sql);
//				sb.append(sql+"\n");
//			}
//		}
//		IOUtil.outputFile(FILE_PATH+"out.txt", sb.toString());
//		
//		StringBuilder output = new StringBuilder();
//		for(String idCard : containIdCards) {
//			output.append(idCard+"\n");
//		}
//		IOUtil.outputFile(FILE_PATH+"outIdCard.txt", output.toString());
		
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
			System.out.print("瀵煎叆娴嬭瘯"+i+"\t"+String.valueOf(idCardStart+i)+"\t"+"999321\n");
		}
		
	}
	
	
	public static final String areacode = "11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65,71,81,82,91,";
	public static boolean isIdCard(String idCard){
		boolean isIdCard = false;
		
		//鍒ゆ柇鍖哄煙缂栫爜鏈夋病鏈夐敊
		String code = idCard.substring(0,2);
		if(!areacode.contains(code)){
			return false;
		}
		//妫�娴嬪勾鏈堟棩鏈夋病鏈夐棶棰�
		int yearNo = 0;
		if(idCard.length()==15){
			yearNo = 1900 + Integer.parseInt(idCard.substring(7, 10));
			String regex = "";
			if(yearNo%400==0|| (yearNo%100!=0&&yearNo%4==0)){//鏄惁鏄棸骞�
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
					Long.parseLong(idCard.substring(0, 17)); // 鍓�17浣嶇函鏁板瓧鍒ゆ柇
					
					char realLastChar = idCard.charAt(17);
					// 鏈�鍚庝竴浣�
					char[] lastArray = new char[]{ '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
					int count = 0;
					// 鍓�17浣嶇郴鏁�
					int[] coefArray = new int[]{ 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
					int index = 0;
					for (; index < coefArray.length; index++) {
						char ch = idCard.charAt(index);
						int num = Integer.parseInt(String.valueOf(ch));
						int coef = coefArray[index];
						count += num * coef;
					}
					char lastChar = lastArray[count % 11];
					if (lastChar == realLastChar) { // 鍏堥�氳繃绯绘暟鍒ゆ柇鏈�鍚庝竴浣嶆槸鍚︽纭�
						return true;
					}
			}
		}
		
		
		return isIdCard;
	}
	
	public static Set<String> findHqlCols(String hql){
		Set<String> set = new HashSet<>();
		String regex = "t(.{0,}?)\\.(.+?)\\b";
		Matcher m = Pattern.compile(regex).matcher(hql);
		while(m.find()){
			if(m.groupCount()>=2){
				set.add(m.group(2));
			}
		}
		return set;
	}
	
	public static Set<String> findHqlTables(String hql){
		Set<String> set = new HashSet<>();
		String regex = "FROM\\s+(.+?)\\b";
		Matcher m = Pattern.compile(regex).matcher(hql);
		while(m.find()){
//			if(m.groupCount()>=2){
				set.add(m.group(1));
//			}
		}
		return set;
	}
	//鎶婃墍鏈夊ぇ鍐欐浛鎹㈡垚_灏忓啓 锛屽  orgCode 鈫� org_code
	public static String formatToDB(String str){
		StringBuilder result = new StringBuilder();
		int lastIndex = 0;
		for(int i=0;i<str.length();i++){
			if(i!=0&&Character.isUpperCase(str.charAt(i))){
				result.append(str.substring(lastIndex, i)+"_");
				lastIndex = i;
			}
		}
		result.append(str.substring(lastIndex));
		
		return result.toString().toLowerCase();
	}
	
	
	public static String formatHqlToSql(String hql){
		
		Set<String> cols = findHqlCols(hql);
		
		for(String col : cols){
			hql = hql.replaceAll(col, formatToDB(col));
			
		}
		cols = findHqlTables(hql);
		for(String col : cols){
			hql = hql.replaceAll(col, formatToDB(col));
			
		}
		return hql ;
	}
	public static String linkSql(String col,Set<String> params){
		StringBuilder sql = new StringBuilder();
		int j = 0;
		boolean isFirst = true;
		sql.append("(");
		int pageSize = 999;
		
		for(String param : params){
			sql.append((isFirst?"":",")+"'"+param+"'");
			if(isFirst){
				isFirst =false;
			}
			if(pageSize==j){
				j=0;
				sql.append(")");
				
				sql.append(" OR t."+col+" IN");
				sql.append("(");
				isFirst = true;
			}
			j++;
		}
		sql.append(")");
		return sql.toString();
	}
	
	public static void createOrgMoveSql(String tableFile,String virtualSqlFile){
		Map<String,TableInfo> tableMap = IOUtil.readDBTableInfoMap(FILE_TABLE_PATH+tableFile,"(.*)org_code(.*)");
		Map<String,TableInfo> tablePamMap = IOUtil.readDBTableInfoMap(FILE_TABLE_PATH+"pamNew");
		StringBuilder sb = new StringBuilder();
		for(java.util.Map.Entry<String, TableInfo> tableEntry: tableMap.entrySet()){
			String tableName = tableEntry.getKey();
			if(tablePamMap.get(tableName)==null){
				continue;
			}
			
			TableInfo tableInfo = tableEntry.getValue();
			List<ColInfo> cols = tableInfo.getColInfos();
			for(ColInfo col : cols){
				String colName = col.getColName();
//				System.out.println(tableName+"锛�"+col.getColName());
				String sql = "UPDATE "+tableName+" SET "+colName+"='$TO' WHERE "+colName+"='$FROM';";
				sb.append(sql+"\r\n");
			}
		}
		IOUtil.outputFile(FILE_PATH+virtualSqlFile, sb.toString());
	}
	
	public static void createRepairSql(String virtualSqlFile,String virtualCodeFile,String repairSqlFile){
		List<String> sqls = IOUtil.readFileList(FILE_PATH+virtualSqlFile);
		List<String> vitualCodes = IOUtil.readFileList(FILE_PATH+virtualCodeFile);
		StringBuilder repairString = new StringBuilder(); 
		for(String virtualCode: vitualCodes){
			for(String sql : sqls){
				sql = sql.replaceAll("\\$FROM", virtualCode);
				sql = sql.replaceAll("\\$TO", virtualCode.substring(0, virtualCode.length()-1)+"9");
				repairString.append(sql+"\r\n");
			}
		}
		IOUtil.outputFile(FILE_PATH+repairSqlFile, repairString.toString());
	}
	public static String createRandomNumberString(int len) {
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		for(int i=0;i<len;i++) {
			sb.append(r.nextInt(9));
		}
		return sb.toString();
	}
	public static String getNodeContent(String nodeName,String xml) {
		Matcher m = Pattern.compile("\""+nodeName+"\"\\:\"(.+?)\"").matcher(xml);
		if(m.find()&&m.groupCount()>0) {
			return m.group(1);
		}
		return "";
	}
}
