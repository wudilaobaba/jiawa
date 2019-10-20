package cn.ttten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDemo2 {
	@Test
	public void testDropTable() throws Exception{//�ڷ������ϵ�һ�£���Һ��Ҽ���run as
		//ɾ����
		String sql = "drop table if exists jdbct1";
		String type = "DDL";
		normalSql(sql, type);
	}
	@Test
	public void testInsert() throws Exception {
		//��������
		String sql = "insert into jdbct1 values(null,'Tom')";
		String type = "DML";
		normalSql(sql, type);
	}
	@Test
	public void testSelect() throws Exception {
		//��ѯ����
		String sql = "select * from jdbct1";
		String type = "DQL";
		normalSql(sql, type);
	}

	public void normalSql(String sql,String type) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?useUnicode=true&characterEncoding=utf8", "root", "whjlyn938751");
		Statement stat = conn.createStatement();
		switch(type) {
			case "DDL":
				stat.execute(sql);
				break;
			case "DML":
				stat.executeUpdate(sql);
				break;
			case "DQL":
				ResultSet rs = stat.executeQuery(sql);//��ѯ���Ľ��
				//�������
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					System.out.println(id+":"+"name");
				}
				rs.close();
				break;
		}
		stat.close();
		conn.close();
	}
}
