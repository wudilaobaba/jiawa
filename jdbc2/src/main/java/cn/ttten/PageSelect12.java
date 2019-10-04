package cn.ttten;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.junit.Test;

public class PageSelect12 {
	@Test
	public void testPage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ҳ��");
		int page = scan.nextInt();
		System.out.println("������ÿҳ����");
		int itemsNum = scan.nextInt();
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			String sql = "select * from user limit ?,?";
			stat = conn.prepareStatement(sql);
			stat.setInt(1, (page-1)*itemsNum);
			stat.setInt(2, itemsNum);
			rs = stat.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(id+":"+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
}
