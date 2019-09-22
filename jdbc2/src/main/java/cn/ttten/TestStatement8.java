package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestStatement8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		Statement stat = null;
		ResultSet rs  = null;
		try {
			System.out.println("请输入姓名");
			String name = scan.nextLine();
			System.out.println("请输入年龄");
			int age = scan.nextInt();
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			stat.executeUpdate("insert into jdbc2 values (null,'"+name+"',"+age+")");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
}
