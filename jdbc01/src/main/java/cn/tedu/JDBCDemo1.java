package cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo1 {

	public static void main(String[] args) throws Exception {
		//1.ע������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.��ȡ���ݿ����Ӷ���  //alt+б��  ���Բ�ȫ
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/whj", "root", "whjlyn938751");
				                                                         //���ݿ�����whj  //�û���           //����
		System.out.println(conn);
	}

}
