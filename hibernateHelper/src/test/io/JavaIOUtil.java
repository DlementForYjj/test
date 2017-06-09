package test.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.codec.Charsets;

public class JavaIOUtil {

	public static String FILE_CHARSET = "gb2312";
	
	public static void main(String[] args) {
		String error1 = readFile("D:\\javaio\\error1.txt");
		String error2 = readFile("D:\\javaio\\error2.txt");
		System.out.println(error1.split(",").length);
		System.out.println(error2.split(",").length);
		Set<String> set = new HashSet<>();
		for(String s:error1.split(",")){
			set.add(s);
		}
		for(String s:error2.split(",")){
			set.add(s);
		}
		System.out.println(set.size());
		
	}
	
	public static String readFile(String pathname){
		StringBuilder sb = new StringBuilder();
		
		try {
//			InputStream is = new FileInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathname)),FILE_CHARSET));
			int i;
			while((i = br.read())!=-1){
				sb.append((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//FIXME 这边关闭流尚未完成，将就使用
			
		}
		return sb.toString();
	}
	public static List<String> readFileList(String pathname){
		List<String> result = new ArrayList<>();
		try {
//			InputStream is = new FileInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathname)),FILE_CHARSET));
			String line;
			while((line = br.readLine())!=null){
				result.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//FIXME 这边关闭流尚未完成，将就使用
			
		}
		
		return result;
	}
	
	public static void outputFile(String pathname,String outputString){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File(pathname)),FILE_CHARSET);
			osw.write(outputString);
			osw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//FIXME 这边关闭流尚未完成，将就使用
			
		}
		
		
	}
	
}
