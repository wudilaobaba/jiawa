package cn.ttten;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.junit.Test;

public class MataDataTest16 {
	@Test
	public void database() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			//�õ����ݿ�Ԫ����
			DatabaseMetaData md = conn.getMetaData();
			System.out.println("�����汾��"+md.getDriverVersion());
			System.out.println("�û�����"+md.getUserName());
			System.out.println("���ӵ�ַ��"+md.getURL());
			System.out.println("���ݿ⳧�̣�"+md.getDatabaseProductName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
	
	@Test
	public void table() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from user");
			//�ӽ�����еõ����Ԫ����
			ResultSetMetaData md = rs.getMetaData();
			//�õ�����ֶ�����
			int count = md.getColumnCount();
			//��ȡÿһ���ֶε�����
			for(int i=0;i<count;i++) {
				String name = md.getColumnName(i+1);
				System.out.println("�ֶ�:"+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
}
