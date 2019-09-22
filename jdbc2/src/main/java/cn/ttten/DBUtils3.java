package cn.ttten;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtils3 {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	static{
		Properties prop = new Properties();
		//得到文件的输入流
		InputStream ips = DBUtils3.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			prop.load(ips);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//封装获取连接对象的代码
	public static Connection getConn() throws Exception {	
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	
	//关闭资源
	public static void close(ResultSet rs,Statement stat, Connection conn) {
		try {
			//避免空指针异常
			if(rs!=null) {
				rs.close();
			}
			if(stat!=null) {
				stat.close();
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
