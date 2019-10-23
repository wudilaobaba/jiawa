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
		Properties prop = new Properties();//实际上Properties就是一个Map
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
	public static Connection getConn() {	
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e); //注意此行要手动进行跑出异常 如果怎样都有异常那么就这样处理
		}
	}
	
	//关闭资源
	public static void close(ResultSet rs,Statement stat, Connection conn) {
		try {
			//避免空指针异常
			if(rs!=null) {
				rs.close();//释放查询结果
			}
			if(stat!=null) {
				stat.close();//释放语句对象
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
