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
		PreparedStatement stat = null; //�Ķ���1.
		ResultSet rs  = null;
		try {
			System.out.println("����������");
			String name = scan.nextLine();
			System.out.println("����������");
			int age = scan.nextInt();
			conn = DBUtils3.getConn();
			//����Ԥ�����sqlִ�ж���
			String sql = "insert into user values(null,?,?)";
			stat = conn.prepareStatement(sql);//�Ķ���2.
			//���°��ʺ��滻Ϊ������ֵ λ�ô�1��ʼ
			stat.setString(1, name);//�Ķ���3.
			stat.setInt(2, age);//�Ķ���3.
			//ִ��sql
			stat.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
	}
}
