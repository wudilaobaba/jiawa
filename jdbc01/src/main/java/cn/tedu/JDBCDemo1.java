package cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo1 {

	public static void main(String[] args) throws Exception {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.获取数据库连接对象  //alt+斜杠  可以补全
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/whj", "root", "whjlyn938751");
				                                                         //数据库名称whj  //用户名           //密码
		System.out.println(conn);
	}

}
