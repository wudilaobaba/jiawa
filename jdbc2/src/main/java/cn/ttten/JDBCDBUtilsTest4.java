package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDBUtilsTest4 {
	//增
	@Test
	public void insert() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs  = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			stat.executeUpdate("insert into jdbc1 values (null,'刘备')");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
	//删
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
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
	//改
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
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
	//查
	@Test
	public void select() {
		//因为已经创建了以下代码的模板，所以只需键入conn Alt+/ 即可自动生成以下代码
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
}
