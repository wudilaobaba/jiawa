package cn.ttten;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPDemo6 {
	public static void main(String[] args) throws Exception {
		//1.创建数据原对象
		BasicDataSource dataSource = new BasicDataSource();
		//2.设置数据库连接信息
		dataSource.setDriverClassName("com.mysql,jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/whj");
		dataSource.setUsername("root");
		dataSource.setPassword("whjlyn938751");
		//3.设置连接池策略信息
		dataSource.setInitialSize(3);//初始连接数量
		dataSource.setMaxActive(5);//最大连接数量
		//4.从连接池中获取连接对象
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		
	}
}
