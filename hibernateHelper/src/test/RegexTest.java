package test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import test.io.IOUtil;

public class RegexTest {

	public static void main(String[] args) {
		List<String> lines = IOUtil.readFileList("D:/javaio/net.txt");
		for(String line :lines ){
			System.out.println(RegexUtils.replaceStart(line, "\\d+", ""));
		}
	}
	
	

	
}
