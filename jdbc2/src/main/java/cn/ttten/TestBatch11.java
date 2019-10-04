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
			String sql1 = "insert into user values(null,'悟空',18)";
			String sql2 = "insert into user values(null,'八戒',28)";
			String sql3 = "insert into user values(null,'沙僧',38)";
			//批量执行：
			stat.addBatch(sql1);
			stat.addBatch(sql2);
			stat.addBatch(sql3);
			//执行arr是每条sql的生效行数
			int arr[] = stat.executeBatch();
			System.out.println("执行完成!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
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
			stat.setString(1, "刘备");
			stat.setInt(2, 20);
			//	添加到批量操作
			stat.addBatch();
			
			stat.setString(1, "关羽");
			stat.setInt(2, 18);
			//	添加到批量操作
			stat.addBatch();
			
			stat.setString(1, "张飞");
			stat.setInt(2, 15);
			//	添加到批量操作
			stat.addBatch();
			
			//执行sql
			int arr[] = stat.executeBatch();
			System.out.println("执行完成");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
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
				//添加到批量处理
				stat.addBatch();//
				if(i%20==0) {
					stat.executeBatch();//避免内存溢出
					stat.clearBatch();//清除执行过的sql，不然会重复添加
				}
			}
			//执行sql
			stat.executeBatch();//这步是必要的
			System.out.println("执行完成");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
}
