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
			System.out.println("����������");
			String name = scan.nextLine();
			System.out.println("����������");
			int age = scan.nextInt();
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			stat.executeUpdate("insert into jdbc2 values (null,'"+name+"',"+age+")");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
}
