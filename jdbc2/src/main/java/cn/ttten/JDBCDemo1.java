package cn.ttten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo1 {
	public static void main(String[] args) throws Exception {
		//1.ע������
		Class.forName("com.mysql.jdbc.Driver");
		//2.��ȡ���ݿ����Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db3", "root", "whjlyn938751");
		System.out.println(conn);
		//3.����sqlִ�ж���
		Statement stat = conn.createStatement();
		//4.ִ��sql  
			//ִ��DDLʹ��execute()  ������/ɾ����
			//ִ��DMLʹ��executeUpdate() ��������  ɾ������  �޸�����
			//ִ��DQLʹ��executeQuery()  ��ѯ����
		String sql = "create table if not exists jdbct1(id int primary key auto_increment,name varchar(10))";
		stat.execute(sql);
		System.out.println("�����ɹ���");
		//5.�ر���Դ
		stat.close();
		conn.close();
		//��ϰ����һ������ ʹ��DML
		
	}
}
