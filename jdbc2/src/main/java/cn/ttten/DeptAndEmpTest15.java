package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeptAndEmpTest15 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			//�������ɲ���
			String sql = "insert into dept values(null,'����')";
			//ִ��sql����ȡ��������ֵ
			stat.execute(sql,Statement.RETURN_GENERATED_KEYS);
			rs = stat.getGeneratedKeys();
			while(rs.next()) {
				int id = rs.getInt(1);
				//������պͰ˽�
				String sql2 = "insert into emp values"
						+ "(null,'���',"+id+"),(null,'�˽�',"+id+")";
				stat.executeUpdate(sql2);
				System.out.println("����ɹ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
}
