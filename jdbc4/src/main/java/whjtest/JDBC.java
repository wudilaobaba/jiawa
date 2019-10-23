package whjtest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

public class JDBC {
	@Test
	public void testmy() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = JDB.getConn();
			stat = conn.createStatement();
			String sql = "insert into whjTable values(null,'LLL',233)";
			stat.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//¹Ø±Õ×ÊÔ´
			JDB.close(rs, stat, conn);
		}
	}
}
