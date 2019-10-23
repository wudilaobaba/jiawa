package whjtest;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;


public class JDB {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static String initSize;
	private static String maxSize;
	private static BasicDataSource dataSource;
	static{
		Properties prop = new Properties();//实际上Properties就是一个Map
		//得到文件的输入流
		InputStream ips = JDB.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			prop.load(ips);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			initSize =  prop.getProperty("initSize");
			maxSize = prop.getProperty("maxSize");
			//使用连接池
			//1.创建数据原对象
			dataSource = new BasicDataSource();
			//2.设置数据库连接信息
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			//3.设置连接池策略信息
			dataSource.setInitialSize(Integer.parseInt(initSize));//初始连接数量
			dataSource.setMaxActive(Integer.parseInt(maxSize));//最大连接数量	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//封装获取连接对象的代码
	public static Connection getConn() {
       
		//4.从连接池中获取连接对象
		try {
			return dataSource.getConnection();
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
