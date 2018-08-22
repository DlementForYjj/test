package hibernateHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		int i = 0;
		
		try{
			int s =10/0;
		}catch(ArithmeticException e){
			try{
				String a = null;
				a.toString();
			}catch(NullPointerException ep){
				ep.printStackTrace();
			}
		}
		
	}
	public static List<String> getAbleValueList(){
		List<String> ableValueList = new ArrayList<String>();
		ableValueList.add("photo");
		ableValueList.add("userId");
		ableValueList.add("userName");
		ableValueList.add("gender");
		ableValueList.add("nation");
		ableValueList.add("birthday");
		ableValueList.add("idCard");
		ableValueList.add("mobilePhone");
		ableValueList.add("birthplace");
		ableValueList.add("orgCode");
		ableValueList.add("innerJob");
		ableValueList.add("probationaryDate");
		ableValueList.add("officialDate");
		ableValueList.add("enterDate");
		ableValueList.add("taxWage");
		ableValueList.add("isFloating");
		ableValueList.add("flowTo");
		ableValueList.add("hasFlowCert");
		ableValueList.add("recUnitType");
		ableValueList.add("firstContactor");
		ableValueList.add("firstContactPhone");
		ableValueList.add("email");
		ableValueList.add("qq");
		ableValueList.add("weChat");
		ableValueList.add("address");
		ableValueList.add("postcode");
		ableValueList.add("unitName");
		ableValueList.add("outerJob");
		ableValueList.add("unitAddress");
		ableValueList.add("graduateCollege");
		ableValueList.add("education");
		ableValueList.add("major");
		ableValueList.add("userResume");
		return ableValueList;
	}
	
}
