package cn.ttten;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPDemo6 {
	public static void main(String[] args) throws Exception {
		//1.��������ԭ����
		BasicDataSource dataSource = new BasicDataSource();
		//2.�������ݿ�������Ϣ
		dataSource.setDriverClassName("com.mysql,jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/whj");
		dataSource.setUsername("root");
		dataSource.setPassword("whjlyn938751");
		//3.�������ӳز�����Ϣ
		dataSource.setInitialSize(3);//��ʼ��������
		dataSource.setMaxActive(5);//�����������
		//4.�����ӳ��л�ȡ���Ӷ���
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		
	}
}
