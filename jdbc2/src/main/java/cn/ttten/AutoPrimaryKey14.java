package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AutoPrimaryKey14 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			String sql = "insert into user values(null,'蜡笔小新',35)";
			//执行sql并且返回自增主键的值
			stat.execute(sql,Statement.RETURN_GENERATED_KEYS);
			//得到返回的主键值
			rs = stat.getGeneratedKeys();
			while(rs.next()) {
				int id = rs.getInt(1);
				System.out.println(id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
}
