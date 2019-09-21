package cn.ttten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils3 {
	//��װ��ȡ���Ӷ���Ĵ���
	public static Connection getConn() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "whjlyn938751");
		return conn;
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
