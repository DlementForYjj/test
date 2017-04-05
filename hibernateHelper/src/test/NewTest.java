package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class NewTest {
	

	    public static void main(String[] args) {
	         
	    	
//	    	@Method printContentType
//	        printContentType("D:/Downloads/java.txt");
//	        printContentType("D:/Downloads/java.ppt");
//	        printContentType("D:/Downloads/java.doc");
//	        printContentType("D:/Downloads/java.jar");
	        
	        
	        
	        
	        String xml = "<test>aaaa</test><Table>bbbb</Table><ColumN>ccc</ColumN>";
            Pattern pattern = Pattern.compile("<.+?>");
            StringBuilder res = new StringBuilder();
            int lastIdx = 0;
            Matcher matchr = pattern.matcher(xml);
            while (matchr.find()) {
                String str = matchr.group();
                res.append(xml.substring(lastIdx, matchr.start()));
                res.append(str.toUpperCase());
                lastIdx = matchr.end();
            }
            res.append(xml.substring(lastIdx));
            System.out.println(res.toString());

	        
	        
	        
	  
	    }
	  
	    private static void printContentType(String pathToFile) {
	          
	        Path path = Paths.get(pathToFile);
	        String contentType = null;
	        try {
	            contentType = Files.probeContentType(path);
	        } catch (IOException e) {
	       
	            e.printStackTrace();
	        }
	        System.out.println("File content type is : " + contentType);
	          
	    }
	     
	           
	
}
