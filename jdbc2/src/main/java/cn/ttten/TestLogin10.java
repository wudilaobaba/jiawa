package cn.ttten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;
//��ֹsqlע��
public class TestLogin10 {
	public static void main(String[] args) {
		//��ȡ�û�������û���������
		Scanner scan = new Scanner(System.in);
		System.out.println("�û���");
		String username = scan.nextLine();
		System.out.println("����");
		String password = scan.nextLine();
		//���õ�¼����
		boolean b = login(username,password);
		if(b){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
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
			stat.setString(1, username);//�Ķ���3.
			stat.setString(2, password);//�Ķ���3.
			stat.executeQuery();
			while(rs.next()){
				//��ȡ��ѯ������Ψһһ�����
				int count = rs.getInt(1);
				//�ж��Ƿ��¼�ɹ�
				if(count>0){
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			DBUtils3.close(rs, stat, conn);
		}
		return false;
	}
}
