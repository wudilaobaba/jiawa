package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionTest13 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DBUtils3.getConn();
			stat = conn.createStatement();
			//关闭自动提交
			conn.setAutoCommit(false);
			//让超人+2000
			String sql1 = "update person set money=money+2000 where id=1";
			//让蝙蝠侠-2000
			String sql2 = "update person set money=money-2000 where id=2";
			//执行sql
			stat.executeUpdate(sql1);
			stat.executeUpdate(sql2);
			
			//查询蝙蝠侠转账后剩余的钱
			String sql3 = "select * from person where id=2";
			rs = stat.executeQuery(sql3);
			while(rs.next()) {
				int money = rs.getInt("money");
				if(money>=0) {//判断转账完后是否还有钱，剩余的钱不能是负数
					conn.commit();
					System.out.println("转账成功");
				}else {
					conn.rollback();
					System.out.println("没钱 咋转？");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			DBUtils3.close(rs, stat, conn);
		}
	}
}
