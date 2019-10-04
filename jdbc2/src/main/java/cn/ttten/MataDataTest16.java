package cn.ttten;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.junit.Test;

public class MataDataTest16 {
	@Test
	public void database() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			//得到数据库元数据
			DatabaseMetaData md = conn.getMetaData();
			System.out.println("驱动版本："+md.getDriverVersion());
			System.out.println("用户名："+md.getUserName());
			System.out.println("连接地址："+md.getURL());
			System.out.println("数据库厂商："+md.getDatabaseProductName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
	
	@Test
	public void table() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from user");
			//从结果集中得到表的元数据
			ResultSetMetaData md = rs.getMetaData();
			//得到表的字段数量
			int count = md.getColumnCount();
			//获取每一个字段的名称
			for(int i=0;i<count;i++) {
				String name = md.getColumnName(i+1);
				System.out.println("字段:"+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
}
