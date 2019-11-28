package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import entity.Admin;
import util.JDB;
/**
 * 持久层实现
 */
@Repository("adminDao")
public class AdminDaoJdpcImpl implements AdminDao {
	@Resource(name="jdb")
	private JDB jdb;
	public Admin findByAdminCode(String code) {
		Admin admin = null;
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			conn = jdb.getConn();
			String sql = "select * from user where username=?";
			stat = conn.prepareStatement(sql);
			stat.setString(1, code);
			rs = stat.executeQuery();
			if(rs.next()) {
				admin = new Admin();
				admin.setCode(rs.getInt("id"));
				admin.setPsw(rs.getString("passward"));
				admin.setUsername(rs.getString("username"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			jdb.rollback(conn);//数据回滚 只要以上程序抛异常，数据就会回滚  ***通常一次DML语句不需要进行回滚，也不需要事务
			throw new RuntimeException("查询员工失败", e);//抛出异常
		} finally {
			//关闭资源
			jdb.close(rs, stat, conn);
		}
		return admin;
	}
}
