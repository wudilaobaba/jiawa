package cn.ttten;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils7 {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static BasicDataSource dataSource;
	static{
		Properties prop = new Properties();
		//得到文件的输入流
		InputStream ips = DBUtils7.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			prop.load(ips);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			//使用连接池
			//1.创建数据原对象
			dataSource = new BasicDataSource();
			//2.设置数据库连接信息
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			//3.设置连接池策略信息
			dataSource.setInitialSize(3);//初始连接数量
			dataSource.setMaxActive(5);//最大连接数量	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//封装获取连接对象的代码
	public static Connection getConn() throws Exception {
		
		//4.从连接池中获取连接对象
		return dataSource.getConnection();
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
