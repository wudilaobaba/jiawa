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
			//插入神仙部门
			String sql = "insert into dept values(null,'神仙')";
			//执行sql并获取自增主键值
			stat.execute(sql,Statement.RETURN_GENERATED_KEYS);
			rs = stat.getGeneratedKeys();
			while(rs.next()) {
				int id = rs.getInt(1);
				//插入悟空和八戒
				String sql2 = "insert into emp values"
						+ "(null,'悟空',"+id+"),(null,'八戒',"+id+")";
				stat.executeUpdate(sql2);
				System.out.println("插入成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
}
