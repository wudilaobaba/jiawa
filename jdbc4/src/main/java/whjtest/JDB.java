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
		Properties prop = new Properties();//ʵ����Properties����һ��Map
		//�õ��ļ���������
		InputStream ips = JDB.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			prop.load(ips);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			initSize =  prop.getProperty("initSize");
			maxSize = prop.getProperty("maxSize");
			//ʹ�����ӳ�
			//1.��������ԭ����
			dataSource = new BasicDataSource();
			//2.�������ݿ�������Ϣ
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			//3.�������ӳز�����Ϣ
			dataSource.setInitialSize(Integer.parseInt(initSize));//��ʼ��������
			dataSource.setMaxActive(Integer.parseInt(maxSize));//�����������	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//��װ��ȡ���Ӷ���Ĵ���
	public static Connection getConn() {
       
		//4.�����ӳ��л�ȡ���Ӷ���
		try {
			return dataSource.getConnection();
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
