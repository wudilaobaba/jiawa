package whjTest;

import java.io.Serializable;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Emp;

public class Whj implements Serializable {
	public static void main(String[] args) {
		//�������л�ȡSqlSession����
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(Whj.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		SqlSession session = ssf.openSession();


		/**
		 * @param 1 ӳ���ļ��������ռ�.id
		 * @param 2 ʵ����
		 */
		Emp emp = new Emp();
		emp.setAge(33);
		emp.setName("����");
		session.insert("test.save",emp);
		session.commit();
		session.close();
	}
}
