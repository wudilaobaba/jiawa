package test;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.whj.project.dao.EmpDAO;
import com.whj.project.entity.Emp;
import com.whj.project.entity.Emp2;

public class TestCase {
	private SqlSession session;
	@Before
	public void init() {
		//�������л�ȡSqlSession����
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		session = ssf.openSession();
	}
	@Test
	public void test01() {
		/**
		 * getMapper����һ������mapperӳ������Ҫ���EmpDAO����
		 */
		//����
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp emp = new Emp();
		emp.setName("����323");
		emp.setAge(66);
		dao.save(emp);
		session.commit();
		session.close();
	}

	@Test
	/**
	 * ��ѯ����
	 */
	public void test02() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		List<Emp> lists = dao.findAll();
		System.out.println(lists);
		session.close();
	}

	@Test
	/**
	 * ����ID��ѯ
	 */
	public void test03() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp emp = dao.findById(3);
		System.out.println(emp);
		session.close();
	}
	
	@Test
	/**
	 * �飺����id���в�ѯ��������Map���͵Ľ��
	 */
	public void test06() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Map<String,Object> map = dao.findById2(6);
		System.out.println(map);
		session.close();
	}
	
	@Test
	/**
	 * �飺����id���в�ѯ��ʵ��Ĳ����������ݿ��ֶ�����һ�µ������
	 */
	public void test07() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp2 emp2 = dao.findById3(55);
		System.out.println(emp2);
		session.close();
	}

	@Test
	/**
	 * �ģ�
	 */
	public void test04() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		//��֮ǰ�Ȳ�ѯ
		Emp emp = dao.findById(4);
		if(emp!=null) {
			emp.setAge(1);
			emp.setName("����111");
			dao.modify(emp);
			session.commit();
			session.close();
		}else {
			System.out.println("Ա��������");
		}
	}

	@Test
	/**
	 * ɾ��
	 */
	public void test05() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		for(int i=34;i<54;i++) {
			//ɾ֮ǰ�Ȳ�ѯ
			Emp emp = dao.findById(i);
			if(emp!=null) {
				dao.delete(i);
				session.commit();
				session.close();
			}else {
				System.out.println("Ա��������");
			}
		}
	}
	
	
}
