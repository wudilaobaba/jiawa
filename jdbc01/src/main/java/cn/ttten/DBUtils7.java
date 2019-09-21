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
		//�õ��ļ���������
		InputStream ips = DBUtils7.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			prop.load(ips);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			//ʹ�����ӳ�
			//1.��������ԭ����
			dataSource = new BasicDataSource();
			//2.�������ݿ�������Ϣ
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			//3.�������ӳز�����Ϣ
			dataSource.setInitialSize(3);//��ʼ��������
			dataSource.setMaxActive(5);//�����������	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//��װ��ȡ���Ӷ���Ĵ���
	public static Connection getConn() throws Exception {
		
		//4.�����ӳ��л�ȡ���Ӷ���
		return dataSource.getConnection();
	}
	
	//�ر���Դ
	public static void close(ResultSet rs,Statement stat, Connection conn) {
		try {
			//�����ָ���쳣
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
