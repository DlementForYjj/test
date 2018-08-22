package test;

import hibernateHelper.PubUser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import test.io.IOUtil;
import test.password.SignTool;

import com.google.gson.Gson;
import com.itextpdf.text.log.SysoCounter;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class test implements Cloneable{

	public String s;
	public String gets(){
		return s;
	}
	
	public static final String DEFAULT_FILE_PATH = "D:/javaio/";
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		PubUser user = new PubUser();
		Field[] fs = PubUser.class.getDeclaredFields();
		for(Field f : fs){
			f.setAccessible(true);
			System.out.println(f.getName());
			
			
		}
		
		
	}
	
	public static Map<String,List<String>> findRetainCols(String path1,String path2){
		Map<String,List<String>> db1 =  IOUtil.readDBTable(path1);
		Map<String,List<String>> db2 =  IOUtil.readDBTable(path2);
		Map<String,List<String>> map =  new HashMap<>();
		for(Entry<String,List<String>> entry:db1.entrySet()){
			String tableName = entry.getKey();
			
			List<String> db1Column = entry.getValue();
			List<String> db2Column = db2.get(tableName);
			
			List<String> tempList = map.get(tableName);
			
			if(tempList==null){
				tempList = new ArrayList<>();
			}
			
			for(String col:db1Column){
				if(!db2Column.contains(col)){
					tempList.add(col);
				}
			}
			map.put(tableName, tempList);
		}
		
		return map;
	}
	

	
	public static String getParamStr(String[] sr){
		StringBuilder sb = new StringBuilder();
		for(String s:sr){
			sb.append(",'"+s.trim()+"'");
		}
		
		return sb.toString().replaceFirst(",", "");
	}
	
	
	public void searchFile(String searchContent){
		String filePath = "D:\\logs";
		for(int i =1;i<31;i++){
			String end = String.valueOf(i);
			if(i<10){
				end = "0"+ end;
			}
			String fileName = "\\party.log.2016-07-"+end;
			File file = new File(filePath+fileName);
			try {
				BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(file),"gb2312"));
				String s;
				while((s=fr.readLine())!=null){
					if(s.contains(searchContent))
					System.out.println(s);
				}
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("未找到文件:"+fileName);
				continue;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static String getFormatAppend(){
		StringBuilder sb = new StringBuilder();
		String filePath = "d:/javaio/";
		String fileName = "line.txt";
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath+fileName),"gb2312"));
			String line = "";
			int i =0;
			while((line=br.readLine())!=null){
				line = line.replaceFirst("(\\s+){1}", "");
				sb.append("contentHtml.append(\""+line+"\");"+"\n");
				i++;
			}
//			System.out.println("总共"+i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	
	
	
	public static String getFormatGrid(){
		StringBuilder sb = new StringBuilder();
		String filePath = "d:/javaio/";
		String fileName = "line.txt";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath+fileName),"gb2312"));
			String line = "";
			while((line=br.readLine())!=null){
				if("offset++;".equals(line.trim())||"".equals(line.trim())){
					continue;
				}
				line = line.replaceFirst("(\\s+){1}", "");
				line = line.replaceFirst("\\);$", "");
				line = line.replaceFirst("form.add\\(((\\s+){0,1}offset,(\\s+){0,1}\\d,(\\s+){0,1})+", "");
				String eleName = getElementName(line);
				sb.append("form.add(\""+eleName+"\",1);\n");
				sb.append("form.add("+line+",3);\n");
//				form.add("35岁以下在岗职工数",1);
//				form.add(new Text("d1692", "35岁以下在岗职工数", companyInfo.getD1692()==null?"":companyInfo.getD1692().toString()),3);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	public static String getElementName(String line){
		Matcher m = Pattern.compile("\"(.{0,}?)\"").matcher(line);
		int findIndex = 0;
		while(m.find()){
			if(++findIndex==2){
				return m.group(1);
			}
		}
		return "";
	}
	
	public static String toMap(){
			StringBuilder sb = new StringBuilder();
			String filePath = "d:/javaio/";
			String fileName = "line.txt";
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath+fileName),"gb2312"));
				String line = "";
				while((line=br.readLine())!=null){
					if("".equals(line.trim())){
						continue;
					}
					if(line.startsWith("\\s")){
						line = line.replaceFirst("(\\s+){1}", "");
					}
					String[] s = line.split("\\s+");
					if(s.length>1){
						sb.append("map.put(\""+s[0]+"\",\""+s[1]+"\");\n");
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return sb.toString();
	}
	
	public static String addPlaceHolder(){
		StringBuilder sb = new StringBuilder();
		String filePath = "d:/javaio/";
		String fileName = "line.txt";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath+fileName),"gb2312"));
			String line = "";
			while((line=br.readLine())!=null){
				if("".equals(line.trim())){
					continue;
				}
				
				if(line.startsWith("\\s")||line.startsWith("\r")){
					line = line.replaceFirst("(\\s+){1}", "");
				}
				line = line.replaceFirst("(\\s+){1}", "");
				if(line.length()<50){
					sb.append(line+"\n");
					continue;
				}
				String eleName = getElementName(line);
				sb.append(line.substring(0, line.lastIndexOf(","))+".setPlaceholder(\""+eleName+"\")"+line.substring(line.lastIndexOf(","))+"\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	public static String add(){
		StringBuilder sb = new StringBuilder();
		String filePath = "d:/javaio/";
		String fileName = "line.txt";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath+fileName),"gb2312"));
			String line = "";
			while((line=br.readLine())!=null){
				line = line.replaceFirst("(\\s+){1}", "");
				String[] args =  line.split("\\s");
				if(args.length!=0){
					sb.append("cols.add(\""+args[0]+"\");\n");
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	public static String getParamNon(int no){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<no;i++){
			sb.append(",?");
		}
		return sb.toString().replaceFirst(",", "");
	}
	
	public String getInsertSql(String tableName,String colName){
//		
//		alter table D16 add d16b22 varchar2(20);
//		comment on column D16.d16b21 is '主管部门';
		String sql = "";
		return sql;
	}
	public String getInsertSql(String tableName,String colName,String callbackTable){
		String sql = "";
		return sql;
	}
	
	public static List<String> getXML(String xmlPath){
		File f = new File(xmlPath);
		try {
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = db.parse(f);
			
			
//			TransformerFactory  tf  =  TransformerFactory.newInstance();
//			Transformer t = tf.newTransformer();
//			t.setOutputProperty("encoding","GB23121");//解决中文问题，试过用GBK不行
//			ByteArrayOutputStream  bos  =  new  ByteArrayOutputStream();
//			t.transform(new DOMSource(doc), new StreamResult(bos));
//			String xmlStr = bos.toString();
//			
//			System.out.println(xmlStr);
			
			
			
			
			
			NodeList list = doc.getElementsByTagName("Table");
			
			for(int i=0;i<list.getLength();i++){
				Node node = list.item(i);
				System.out.println(node);
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		catch (TransformerConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (TransformerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static List<Class> getAllClassByInterface(Class c) {
        List<Class>  returnClassList = null;
        
        if(c.isInterface()) {
            // 获取当前的包名
            String packageName = c.getPackage().getName();
            // 获取当前包下以及子包下所以的类
            List<Class<?>> allClass = getClasses(packageName);
            if(allClass != null) {
                returnClassList = new ArrayList<Class>();
                for(Class classes : allClass) {
                    // 判断是否是同一个接口
                    if(c.isAssignableFrom(classes)) {
                        // 本身不加入进去
                        if(!c.equals(classes)) {
                            returnClassList.add(classes);        
                        }
                    }
                }
            }
        }
        
        return returnClassList;
    }
	
	public static List<Class<?>> getClasses(String packageName){
        
        //第一个class类的集合
        List<Class<?>> classes = new ArrayList<Class<?>>();
        //是否循环迭代
        boolean recursive = true;
        //获取包的名字 并进行替换
        String packageDirName = packageName.replace('.', '/');
        //定义一个枚举的集合 并进行循环来处理这个目录下的things
        Enumeration<URL> dirs;
        try {
            dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
            //循环迭代下去
            while (dirs.hasMoreElements()){
                //获取下一个元素
                URL url = dirs.nextElement();
                //得到协议的名称
                String protocol = url.getProtocol();
                //如果是以文件的形式保存在服务器上
                if ("file".equals(protocol)) {
                    //获取包的物理路径
                    String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                    //以文件的方式扫描整个包下的文件 并添加到集合中
                    findAndAddClassesInPackageByFile(packageName, filePath, recursive, classes);
                } else if ("jar".equals(protocol)){
                    //如果是jar包文件 
                    //定义一个JarFile
                    JarFile jar;
                    try {
                        //获取jar
                        jar = ((JarURLConnection) url.openConnection()).getJarFile();
                        //从此jar包 得到一个枚举类
                        Enumeration<JarEntry> entries = jar.entries();
                        //同样的进行循环迭代
                        while (entries.hasMoreElements()) {
                            //获取jar里的一个实体 可以是目录 和一些jar包里的其他文件 如META-INF等文件
                            JarEntry entry = entries.nextElement();
                            String name = entry.getName();
                            //如果是以/开头的
                            if (name.charAt(0) == '/') {
                                //获取后面的字符串
                                name = name.substring(1);
                            }
                            //如果前半部分和定义的包名相同
                            if (name.startsWith(packageDirName)) {
                                int idx = name.lastIndexOf('/');
                                //如果以"/"结尾 是一个包
                                if (idx != -1) {
                                    //获取包名 把"/"替换成"."
                                    packageName = name.substring(0, idx).replace('/', '.');
                                }
                                //如果可以迭代下去 并且是一个包
                                if ((idx != -1) || recursive){
                                    //如果是一个.class文件 而且不是目录
                                    if (name.endsWith(".class") && !entry.isDirectory()) {
                                        //去掉后面的".class" 获取真正的类名
                                        String className = name.substring(packageName.length() + 1, name.length() - 6);
                                        try {
                                            //添加到classes
                                            classes.add(Class.forName(packageName + '.' + className));
                                        } catch (ClassNotFoundException e) {
                                            e.printStackTrace();
                                        }
                                      }
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        return classes;
    }
	
	
	/**
	 * 以文件的形式来获取包下的所有Class
	 * @param packageName
	 * @param packagePath
	 * @param recursive
	 * @param classes
	 */
	public static void findAndAddClassesInPackageByFile(String packageName, String packagePath, final boolean recursive, List<Class<?>> classes){
	    //获取此包的目录 建立一个File
	    File dir = new File(packagePath);
	    //如果不存在或者 也不是目录就直接返回
	    if (!dir.exists() || !dir.isDirectory()) {
	        return;
	    }
	    //如果存在 就获取包下的所有文件 包括目录
	    File[] dirfiles = dir.listFiles(new FileFilter() {
	    	//自定义过滤规则 如果可以循环(包含子目录) 或则是以.class结尾的文件(编译好的java类文件)
	        public boolean accept(File file) {
	           return (recursive && file.isDirectory()) || (file.getName().endsWith(".class"));
	        }
	    });
	    //循环所有文件
	    for (File file : dirfiles) {
	        //如果是目录 则继续扫描
	        if (file.isDirectory()) {
	            findAndAddClassesInPackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(), recursive, classes);
	        }else {
	            //如果是java类文件 去掉后面的.class 只留下类名
	            String className = file.getName().substring(0, file.getName().length() - 6);
	            try {
	                //添加到集合中去
	                classes.add(Class.forName(packageName + '.' + className));
	            } catch (ClassNotFoundException e) {
	                e.printStackTrace();
	            }
	       }
	    }
	}
	public static int printfLength(String s){
		System.out.println(s.split(",").length);
		return s.split(",").length;
	}
	
	public static void copyFile(String fromPath,String toPath){
		
		try {
			OutputStream os = new FileOutputStream(new File(toPath));
			InputStream is = new FileInputStream(new File(fromPath));
			byte[] buffer = new byte[1024];
			int flag = 0;
			while( (flag = is.read(buffer))!=-1 ){
				os.write(buffer,0,flag);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//FIXME 求质数
//	String regex = "^1?$|^(11+?)\\1+$";
//	StringBuffer sb = new StringBuffer();
//	for (int i = 1; i <= 5000; i++) {
//		sb.append("1");
//		if (!sb.toString().matches(regex)) {
//			System.out.println(i);
//		}
//	}
	
	public static void printfFormatSql(String fileName,String columnName){
		List<String> userIds = IOUtil.readFileList(fileName);
		StringBuilder sb = new StringBuilder();
		int splitLength = 500;
		for(int i=splitLength;i<userIds.size();i+=splitLength){
			StringBuilder subsb = new StringBuilder();
			subsb.append(" OR "+columnName+" IN(");
			for(int j=i-splitLength;j<i;j++){
				
				subsb.append(",'");
				subsb.append(userIds.get(j));
				subsb.append("'");
				
			}
			subsb.append(") ");
			sb.append(subsb.toString().replaceFirst(",", ""));
		}
		
		IOUtil.outputFile("D:\\javaio\\result.txt", sb.toString().replaceFirst("OR", ""));
		
	}
	
	  public static boolean print(String path){ 
		  if(path != null){
		          ComThread.InitSTA(); 
		          ActiveXComponent xl = new ActiveXComponent("Excel.Application"); 
		           try { 
		              // System.out.println("version=" + xl.getProperty("Version")); 
		                 //不打开文档 
		                 Dispatch.put(xl, "Visible", new Variant(false)); //new Variant(true)显示文档
		                 Dispatch workbooks = xl.getProperty("Workbooks").toDispatch(); 
		                 Dispatch excel=Dispatch.call(workbooks,"Open",path).toDispatch(); 
		                //调用excel宏的方法(不带参数的宏)需要说明宏所在的文档  
		                Dispatch.call(xl, "Run", new Variant("test.xls!Sheet1.test"));         
		                 // 横向打印
		                // Dispatch currentSheet = Dispatch.get(excel, "ActiveSheet")
		                // .toDispatch();
		                // Dispatch pageSetup = Dispatch
		                // .get(currentSheet, "PageSetup").toDispatch();
		                 // Dispatch.put(pageSetup, "Orientation", new Variant(2)); //Variant(2)横向打印
		                 //设置边距
		                // Dispatch.put(pageSetup,"LeftMargin",0);
		                // Dispatch.put(pageSetup,"RightMargin",0);
		                // Dispatch.put(pageSetup,"TopMargin",0);
		               //  Dispatch.put(pageSetup,"BottomMargin",0);
		                 //开始打印 
		                 Dispatch.get(excel,"PrintOut"); 
		                 //增加以下三行代码解决文件无法删除bug
		                 Dispatch.call(excel, "save");
		                 Dispatch.call(excel,  "Close" ,  new  Variant(true)); 
		                 excel=null;

		                 return true;
		              } catch (Exception e) { 
		                  e.printStackTrace(); 
		                  return false;
		                } finally { 
		                    //始终释放资源 
		                   xl.invoke("Quit", new Variant[] {});
		                   xl=null;
		                   ComThread.Release();
		                   } 
		    }else {
		       return false;
		    }
		   }  
	  
	  /**
		 * 计算两个时间之间间隔几天
		 * @param startDate
		 * @param endDate
		 * @return
		 * @throws ParseException
		 */
	    public static int daysBetween(Date startDate,Date endDate){    
	    	int daysBetween = -1;
	    	if(startDate==null||endDate==null){
	    		return daysBetween;
	    	}
	    	try{
		    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				startDate=sdf.parse(sdf.format(startDate));
				endDate=sdf.parse(sdf.format(endDate));
				Calendar cal = Calendar.getInstance();
				cal.setTime(startDate);
				long time1 = cal.getTimeInMillis();
				cal.setTime(endDate);
				long time2 = cal.getTimeInMillis();
				long betweenDays=(time2-time1)/(1000*3600*24);
				daysBetween = Integer.parseInt(String.valueOf(betweenDays));
	    	}catch (ParseException e) {
				// TODO Auto-generated catch block
			}
	    	
	    	return daysBetween;
	    }    
	
}
