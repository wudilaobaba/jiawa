package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import entity.Admin;
import util.JDB;
/**
 * �־ò�ʵ��
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
			jdb.rollback(conn);//���ݻع� ֻҪ���ϳ������쳣�����ݾͻ�ع�  ***ͨ��һ��DML��䲻��Ҫ���лع���Ҳ����Ҫ����
			throw new RuntimeException("��ѯԱ��ʧ��", e);//�׳��쳣
		} finally {
			//�ر���Դ
			jdb.close(rs, stat, conn);
		}
		return admin;
	}
}
