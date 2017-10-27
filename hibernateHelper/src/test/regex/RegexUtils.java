package test.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {

	
	public static String replaceStart(String input,String startRegex,String replaceWith){
		String regex = "^("+startRegex+")(.+)?";
		Matcher m = Pattern.compile(regex).matcher(input);
		String startStr = "";
		if(m.find()){
			startStr = m.group(1);
		}
		return input.replaceFirst(startStr, replaceWith);
	}
}
