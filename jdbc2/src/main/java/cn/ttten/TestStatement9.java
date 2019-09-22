package cn.ttten;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestStatement9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement stat = null; //改动点1.
		ResultSet rs  = null;
		try {
			System.out.println("请输入姓名");
			String name = scan.nextLine();
			System.out.println("请输入年龄");
			int age = scan.nextInt();
			conn = DBUtils3.getConn();
			//创建预编译的sql执行对象
			String sql = "insert into user values(null,?,?)";
			stat = conn.prepareStatement(sql);//改动点2.
			//以下把问号替换为真正的值 位置从1开始
			stat.setString(1, name);//改动点3.
			stat.setInt(2, age);//改动点3.
			//执行sql
			stat.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
}
