package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionTest13 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			//�ر��Զ��ύ
			conn.setAutoCommit(false);
			//�ó���+2000
			String sql1 = "update person set money=money+2000 where id=1";
			//��������-2000
			String sql2 = "update person set money=money-2000 where id=2";
			//ִ��sql
			stat.executeUpdate(sql1);
			stat.executeUpdate(sql2);
			
			//��ѯ������ת�˺�ʣ���Ǯ
			String sql3 = "select * from person where id=2";
			rs = stat.executeQuery(sql3);
			while(rs.next()) {
				int money = rs.getInt("money");
				if(money>=0) {//�ж�ת������Ƿ���Ǯ��ʣ���Ǯ�����Ǹ���
					conn.commit();
					System.out.println("ת�˳ɹ�");
				}else {
					conn.rollback();
					System.out.println("ûǮ զת��");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
}
