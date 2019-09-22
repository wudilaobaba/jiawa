package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDBUtilsTest4 {
	//��
	@Test
	public void insert() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs  = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			stat.executeUpdate("insert into jdbc1 values (null,'����')");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
	//ɾ
	@Test
	public void delete() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs  = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			stat.executeUpdate("");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
	//��
	@Test
	public void uodate() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs  = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			stat.execute("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
	//��
	@Test
	public void select() {
		//��Ϊ�Ѿ����������´����ģ�壬����ֻ�����conn Alt+/ �����Զ��������´���
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
}
