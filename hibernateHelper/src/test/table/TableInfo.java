package test.table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import test.io.IOUtil;
import antlr.Utils;

public class TableInfo {
	//FIXME 支持正则匹配
	//FIXME 支持直接通过文件名实例化
	
	
	
	String tableName;
	List<ColInfo> colInfos = new ArrayList<>();

	String colNameRegex;
	
	
	public TableInfo(){
		
		
	}
	
	public TableInfo(String filePath){
		
		
	}
	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	
	public List<ColInfo> getColInfos() {
		return colInfos;
	}

	public void setColInfos(List<ColInfo> colInfos) {
		this.colInfos = colInfos;
	}
	
	public void addCol(ColInfo info){
		if(info.getColName()!=null){
			info.setColName(info.getColName().trim());
		}
		if(info.getColRemark()!=null){
			info.setColRemark(info.getColRemark().trim());
		}
		if(colNameRegex!=null&&!"".equals(colNameRegex.trim())){
			Matcher m = Pattern.compile(colNameRegex).matcher(info.getColName());
			if(m.matches()){
				colInfos.add(info);
			}
		}else{
			colInfos.add(info);
		}
	}
	
	public ColInfo getCol(String colName){
		ColInfo info = new ColInfo();
		if(colName==null){
			return info;
		}
		for(ColInfo colInfo:colInfos){
			if(colName.equals(colInfo.getColName())){
				info = colInfo;
				break;
			}
		}
		return info;
	}
	
	public void setCol(ColInfo info){
		if(info==null||info.getColName()==null){
			return ;
		}
		for(ColInfo colInfo:colInfos){
			if(info.getColName().equals(colInfo.getColName())){
				//FIXME 后面补充表的类反射
				info.setColRemark(info.getColRemark());
				break;
			}
		}
		
	}

	public String getColNameRegex() {
		return colNameRegex;
	}

	public void setColNameRegex(String colNameRegex) {
		this.colNameRegex = colNameRegex;
	}

	
	
}
