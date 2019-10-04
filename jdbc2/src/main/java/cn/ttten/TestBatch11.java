package cn.ttten;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class TestBatch11 {
	@Test
	public void testStatment() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			String sql1 = "insert into user values(null,'���',18)";
			String sql2 = "insert into user values(null,'�˽�',28)";
			String sql3 = "insert into user values(null,'ɳɮ',38)";
			//����ִ�У�
			stat.addBatch(sql1);
			stat.addBatch(sql2);
			stat.addBatch(sql3);
			//ִ��arr��ÿ��sql����Ч����
			int arr[] = stat.executeBatch();
			System.out.println("ִ�����!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
	@Test
	public void testPreparedStatment() {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			String sql = "insert into user values(null,?,?)";
			stat = conn.prepareStatement(sql);
			stat.setString(1, "����");
			stat.setInt(2, 20);
			//	��ӵ���������
			stat.addBatch();
			
			stat.setString(1, "����");
			stat.setInt(2, 18);
			//	��ӵ���������
			stat.addBatch();
			
			stat.setString(1, "�ŷ�");
			stat.setInt(2, 15);
			//	��ӵ���������
			stat.addBatch();
			
			//ִ��sql
			int arr[] = stat.executeBatch();
			System.out.println("ִ�����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
	
	@Test
	public void testBatch() {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			String sql = "insert into user values(null,?,?)";
			stat = conn.prepareStatement(sql);
			for(int i=0;i<100;i++) {
				stat.setString(1,"name"+i);
				stat.setInt(2, i);
				//��ӵ���������
				stat.addBatch();//
				if(i%20==0) {
					stat.executeBatch();//�����ڴ����
					stat.clearBatch();//���ִ�й���sql����Ȼ���ظ����
				}
			}
			//ִ��sql
			stat.executeBatch();//�ⲽ�Ǳ�Ҫ��
			System.out.println("ִ�����");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
}
