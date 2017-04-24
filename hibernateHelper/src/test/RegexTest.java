package test;

import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		String regex = "(\\w){16}";
		String input = "吴1";
		
		System.out.println(Pattern.compile(regex).matcher(input).matches());
	}
	
}
