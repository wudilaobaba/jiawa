package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;
//防止sql注入
public class TestLogin10 {
	public static void main(String[] args) {
		//获取用户输入的用户名和密码
		Scanner scan = new Scanner(System.in);
		System.out.println("用户名");
		String username = scan.nextLine();
		System.out.println("密码");
		String password = scan.nextLine();
		//调用登录方法
		boolean b = login(username,password);
		if(b){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	}
	private static boolean login(String username,String password){
		Connection conn = null;
//		Statement stat = null;
		PreparedStatement stat = null;
		ResultSet rs  = null;
		try {
			conn = DBUtils3.getConn();
			//stat = conn.createStatement();
			//String sql = "select count(*) from t_login where username='"+username+"' & password='"+password+"'";
			//rs=stat.executeQuery(sql);
			
			String sql = "select count(*) from t_login where username=? & password=?";
			stat = conn.prepareStatement(sql);
			stat.setString(1, username);//改动点3.
			stat.setString(2, password);//改动点3.
			stat.executeQuery();
			while(rs.next()){
				//获取查询回来的唯一一个结果
				int count = rs.getInt(1);
				//判断是否登录成功
				if(count>0){
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
		return false;
	}
}
