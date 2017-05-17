package dbconn;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnForMysql {

	public static void getConnection(){
		
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名scutcs
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		// MySQL配置时的用户名
		String user = "root";
		// Java连接MySQL配置时的密码
		String password = "8725819";
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 连续数据库
			Connection conn = (Connection) DriverManager.getConnection(url, user, password);
			if(!conn.isClosed())
			System.out.println("Succeeded connecting to the Database!");
			// statement用来执行SQL语句
			Statement statement = (Statement) conn.createStatement();
			// 要执行的SQL语句
			String sql = "select * from pub_user";
			String name = "";
			ResultSet rs = statement.executeQuery(sql);  
			
			while(rs.next()) {
				    
				// 选择sname这列数据
				name = rs.getString("user_name");
		    
				// 首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
				// 然后使用GB2312字符集解码指定的字节数组
				name = new String(name.getBytes("ISO-8859-1"),"GB2312");
	
				// 输出结果
				System.out.println(name);
			}
	
			rs.close();
			conn.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		getConnection();
	}
	
}
