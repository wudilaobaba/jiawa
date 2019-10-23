package whjtest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = JDB.getConn();
			stat = conn.createStatement();
			String str = "select * from whjTable";
			rs = stat.executeQuery(str);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int no = rs.getInt("no");
				System.out.println(id+" "+name+" "+no);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//¹Ø±Õ×ÊÔ´
			JDB.close(rs, stat, conn);
		}
	}
}
