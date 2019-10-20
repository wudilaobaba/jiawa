package cn.ttten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo1 {
	public static void main(String[] args) throws Exception {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");//注册mysql
		//Class.forName("oracle.jdbc.driver.OracleDriver");//注册oracle
		//2.获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db3?useUnicode=true&characterEncoding=utf8", "root", "whjlyn938751");
		//连接orical的地址为：jdbc:oracle:thin:@192.168.9.12:1521:db3
		//此处常见报错的解决：
		//https://blog.csdn.net/zhangjing0320/article/details/91045149
		//https://blog.csdn.net/txwtech/article/details/80787886
		//输出conn引用对象的实际类型
		//证明：驱动程序提供了connection接口的实现类
		System.out.println(conn.getClass());
		
		//3.创建sql执行对象
		Statement stat = conn.createStatement();
		//4.执行sql  
			//执行DDL使用execute()  创建表/删除表 ---                 表
			//执行DML使用executeUpdate() 插入数据  删除数据  修改数据   增删改
			//执行DQL使用executeQuery()  查询数据                    查
		String sql = "create table if not exists jdbct1(id int primary key auto_increment,name varchar(10))";
		stat.execute(sql);
		//返回结果：true 表示有结果集
		//        false 表示没有结果集
		//        创建失败就抛出异常
		//如何判断结果：如果没有异常则创建成功
		
		//executeUpdate 返回数字，表示更新成功；抛异常则失败
		//executeQuery 返回ResultSet(结果集)对象，代表二维查询结果，使用for循环遍历处理；如果查询失败则抛出异常
		System.out.println("表创建成功！");
		//5.关闭数据连接
		stat.close();
		conn.close();
		//练习插入一条数据 使用DML
		
		/**
		 * 以下是JDBC最基本的步骤：
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db3?useUnicode=true&characterEncoding=utf8", "root", "whjlyn938751");
		  Statement stat = conn.createStatement();
		  String sql = "";
		  stat.execute(sql);
		  stat.close();
		  conn.close();
		 */
		
	}
}
