package test;

import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import antlr.Utils;

import com.google.common.collect.Multiset.Entry;
import com.google.gson.Gson;

import javassist.tools.reflect.Reflection;
import test.io.IOUtil;
import test.table.TableUtil;
import test.util.CalMap;

public class WorkUtils {
	public static String filePath = "D:\\javaio\\";
	
	public static void main(String[] args) {
		
//		Set<String> dataIds = new HashSet<>();
//		dataIds.add("dfafa");
//		dataIds.add("dfafa");
//		dataIds.add("dfafas");
//		
//		System.out.println(dataIds.toString());
		
		System.out.println(formatHqlToSql("SELECT t.functionId FROM PubFunctionConfig t,PubPermission t1,PubRoleMember t2 WHERE t.functionId=t1.id.operId AND t1.id.roleId=t2.id.roleId AND t2.id.userId=?AND t.functionType IN(?,?)"));
	
//		List<String> idCards = IOUtil.readFileList(filePath+"idCard.txt");
//		List<String> idCard2s = IOUtil.readFileList(filePath+"idCard2.txt");
//		中国海峡人才市场
//		StringBuilder sql = new StringBuilder();
//		int j = 0;
//		boolean isFirst = true;
//		int pageSize = 999;
//		for(String idCard : idCards){
//			sql.append((isFirst?"":",")+"'"+idCard+"'");
//			if(isFirst){
//				isFirst =false;
//			}
//			if(pageSize==j){
//				j=0;
//				sql.append(")");
//				sql.append(" OR t.id_Card IN");
//				sql.append("(");
//				isFirst = true;
//			}
//			j++;
//		}
//		IOUtil.outputFile(filePath+"身份证.txt", sql.toString());
		
		
		Map<String,List<String>> userNameMap = new HashMap<>();
		List<String> lines = IOUtil.readFileList(filePath+"test.txt");
		List<String> userNameN = IOUtil.readFileList(filePath+"userNameN.txt");
		List<String> userNameP = IOUtil.readFileList(filePath+"userNameN.txt");
		for(String line : lines){
			String[] lineInfos = line.split("\t");
			String userName = lineInfos[0];
			String idCard = lineInfos[1];
			String birthDay = lineInfos[2];
			String gender = lineInfos[3];
			String userCate = lineInfos[4];
			String enterDate = lineInfos[5];
			String officialDate = lineInfos[6];
			
			String userInfo = userName+"\t"+idCard+"\t"+birthDay+"\t"+gender+"\t"+userCate+"\t"+enterDate+"\t"+officialDate;
			
			
			boolean idCardNotNull =idCard!=null&&!"".equals(idCard); 
			if(idCardNotNull){
			}else{
				List<String> userInfoList=userNameMap.get(userName);
				if(userInfoList==null){
					userInfoList = new ArrayList<>();
				}
				userInfoList.add(userInfo);
				userNameMap.put(userName, userInfoList);
			}
		}
		
		Set<String> userNames = new HashSet<>();
		Set<String> n = new HashSet<>();
		
		
		List<String> printInfos = new ArrayList<>();
		List<String> userNameE = IOUtil.readFileList(filePath+"userName.txt");
		for(java.util.Map.Entry<String, List<String>> entry : userNameMap.entrySet()){
			String userName = entry.getKey();
			List<String> list = entry.getValue();
			if(!userNameN.contains(userName)){
				if(!userNameE.contains(userName)&&list.size()==1){
					printInfos.add(userName);
				}
			}
		}
		
		
		IOUtil.outPutFileList(printInfos, filePath+"out.txt");
		
		
		
		List<String> outList = IOUtil.readFileList(filePath+"out.txt");
		n.addAll(outList);
		
		
		System.out.println("SELECT t.user_name,t.id_card,t.birthday,t.gender,t.user_category,t.enter_date,t.official_date,t.org_code,t1.org_name,t1.contactor,t1.contact_phone FROM PUB_USER T left join pub_organize t1 on t1.org_code = t.org_code  WHERE T.USER_NAME in"+linkSql("outList", n));
//		IOUtil.outputFile(filePath+"idCard.txt", sb.toString());
		
//		-- Create table
//		create table ID_CARD_ARCH
//		(
//		  id_card   varchar2(128),
//		  user_name varchar2(300)
//		)
//		;
		
		//能匹配成功的2种 
		//1.身份证对应上
		//SELECT t.* FROM ID_CARD_ARCH t WHERE NOT EXISTS(SELECT t1.idCard FROM PUB_USER t1 WHERE t1.id_card = t.id_card); 
		
//		StringBuilder out = new StringBuilder();
//		for(String idCard :idCardMap.keySet()){
//			if(idCard.length()>14){
//				out.append("INSERT INTO ID_CARD_ARCH(ID_CARD) VALUES('"+idCard+"');\r\n");
//			}else{
//				String userName = idCardMap.get(idCard);
//				cMap.put(userName, 1);
//				userNameList.add(idCardMap.get(idCardMap.keySet()));
//			}
//		}
//		IOUtil.outputFile(filePath+"out.sql", out.toString());
		
		
		
//		2.身份证没有的，姓名唯一的
//		List<String> unicNames = cMap.getOnlyOne();
//		
//		System.out.println(unicNames);
//		
//		List<String> repeatUserNames = cMap.getBiggerThan(1);
//		List<String> repeatUserNames = IOUtil.readFileList(filePath+"test1.txt");
//		StringBuilder outRepeat = new StringBuilder();
//		for(String userName : repeatUserNames){
//			List<String> userInfos = userInfoMap.get(userName);
//			for(String userInfo: userInfos){
//				outRepeat.append(userInfo+"\r\n");
//			}
//		}
//		IOUtil.outputFile(filePath+"姓名在e家重复的人员名单.txt", outRepeat.toString());
		
		
		
//		//需要输出的
//		//1.姓名重复的
//		
//		
//		
//		List<String> bzgxLines = IOUtil.readFileList(filePath+"bzhx.txt");
//		List<String> bzgxList = new ArrayList<>();
//		for(String bzgxLine : bzgxLines){
//			String idCard = "";
//			String[] lineInfos = bzgxLine.split("\t+");
//			if(lineInfos.length>1){
//				idCard = lineInfos[1];
//			}
//			if(!"".equals(idCard)){
//				bzgxList.add(idCard);
//			}
//		}
//		
//		for(String idCard : bzgxList){
//			Set<String> entrySet = idCardMap.keySet();
//			if(!entrySet.contains(idCard)){
//			}
//		}
		
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
	//把所有大写替换成_小写 ，如  orgCode → org_code
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
	public static String linkSql(String col,Set<String> userNames){
		StringBuilder sql = new StringBuilder();
		int j = 0;
		boolean isFirst = true;
		sql.append("(");
		int pageSize = 999;
		for(String idCard : userNames){
			sql.append((isFirst?"":",")+"'"+idCard+"'");
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
}
