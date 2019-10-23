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
		Properties prop = new Properties();//ʵ����Properties����һ��Map
		//�õ��ļ���������
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
	//��װ��ȡ���Ӷ���Ĵ���
	public static Connection getConn() {	
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e); //ע�����Ҫ�ֶ������ܳ��쳣 ������������쳣��ô����������
		}
	}
	
	//�ر���Դ
	public static void close(ResultSet rs,Statement stat, Connection conn) {
		try {
			//�����ָ���쳣
			if(rs!=null) {
				rs.close();//�ͷŲ�ѯ���
			}
			if(stat!=null) {
				stat.close();//�ͷ�������
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
