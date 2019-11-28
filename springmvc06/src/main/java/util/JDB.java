package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;
@Component("jdb")
public class JDB {
	@Resource(name="ds")
	private DataSource dataSource;
	//��װ��ȡ���Ӷ���Ĵ���
	public Connection getConn() {
		//4.�����ӳ��л�ȡ���Ӷ���  
		try {
			return dataSource.getConnection();//�����ӳ��л�ȡ���õ����ӣ������ӳ����ˣ���ȴ�����������ӹ黹�����ȡ���õ�����
		} catch (Exception e) {
			//����־(�����ֳ�)
			e.printStackTrace();
			/**
			 * ���쳣�ܷ�ָ�������ܹ��ָ����������ָ�
			 * ������ܹ��ָ����������ݿ�ֹͣ������ʾ�û��Ժ�����
			 */
			throw new RuntimeException(e); //ע�����Ҫ�ֶ������ܳ��쳣 ������������쳣��ô����������
		}
	}

	//�ر���Դ
	public void close(ResultSet rs,Statement stat, Connection conn) {
		try {
			//�����ָ���쳣
			if(rs!=null) {
				rs.close();//�ͷŲ�ѯ���
			}
			if(stat!=null) {
				stat.close();//�ͷ�������
			}
			if(conn!=null) {
				conn.close();//���ù������ӹ黹�����ӳ�
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//���ݻع�
	public void rollback(Connection conn) {
		if(conn!=null) {
			try {
				conn.rollback();//����Ļع�һ����������� 
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
