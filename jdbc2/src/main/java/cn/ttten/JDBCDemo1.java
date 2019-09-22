package cn.ttten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo1 {
	public static void main(String[] args) throws Exception {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db3", "root", "whjlyn938751");
		System.out.println(conn);
		//3.创建sql执行对象
		Statement stat = conn.createStatement();
		//4.执行sql  
			//执行DDL使用execute()  创建表/删除表
			//执行DML使用executeUpdate() 插入数据  删除数据  修改数据
			//执行DQL使用executeQuery()  查询数据
		String sql = "create table if not exists jdbct1(id int primary key auto_increment,name varchar(10))";
		stat.execute(sql);
		System.out.println("表创建成功！");
		//5.关闭资源
		stat.close();
		conn.close();
		//练习插入一条数据 使用DML
		
	}
}
