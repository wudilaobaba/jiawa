package cn.ttten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo1 {
	public static void main(String[] args) throws Exception {
		//1.ע������
		Class.forName("com.mysql.jdbc.Driver");//ע��mysql
		//Class.forName("oracle.jdbc.driver.OracleDriver");//ע��oracle
		//2.��ȡ���ݿ����Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db3?useUnicode=true&characterEncoding=utf8", "root", "whjlyn938751");
		//����orical�ĵ�ַΪ��jdbc:oracle:thin:@192.168.9.12:1521:db3
		//�˴���������Ľ����
		//https://blog.csdn.net/zhangjing0320/article/details/91045149
		//https://blog.csdn.net/txwtech/article/details/80787886
		//���conn���ö����ʵ������
		//֤�������������ṩ��connection�ӿڵ�ʵ����
		System.out.println(conn.getClass());
		
		//3.����sqlִ�ж���
		Statement stat = conn.createStatement();
		//4.ִ��sql  
			//ִ��DDLʹ��execute()  ������/ɾ���� ---                 ��
			//ִ��DMLʹ��executeUpdate() ��������  ɾ������  �޸�����   ��ɾ��
			//ִ��DQLʹ��executeQuery()  ��ѯ����                    ��
		String sql = "create table if not exists jdbct1(id int primary key auto_increment,name varchar(10))";
		stat.execute(sql);
		//���ؽ����true ��ʾ�н����
		//        false ��ʾû�н����
		//        ����ʧ�ܾ��׳��쳣
		//����жϽ�������û���쳣�򴴽��ɹ�
		
		//executeUpdate �������֣���ʾ���³ɹ������쳣��ʧ��
		//executeQuery ����ResultSet(�����)���󣬴����ά��ѯ�����ʹ��forѭ���������������ѯʧ�����׳��쳣
		System.out.println("�����ɹ���");
		//5.�ر���������
		stat.close();
		conn.close();
		//��ϰ����һ������ ʹ��DML
		
		/**
		 * ������JDBC������Ĳ��裺
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db3?useUnicode=true&characterEncoding=utf8", "root", "whjlyn938751");
		  Statement stat = conn.createStatement();
		  String sql = "";
		  stat.execute(sql);
		  stat.close();
		  conn.close();
		 */
		
	}
}
