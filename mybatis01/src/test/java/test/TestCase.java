package test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import entity.Emp;
import entity.Emp2;

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
	public void test01() { //��
		/**
		 * @param 1 ӳ���ļ��������ռ�.id
		 * @param 2 ʵ����
		 */
		Emp emp = new Emp();
		emp.setId(903);
		emp.setAge(3);
		emp.setName("��2");
		session.insert("test.save",emp);  //���ӳ���ļ��������ռ����ֲ�ͬ
		session.commit();
		session.close();
	}

	@Test
	public void test02() { //�飺����
		List<Emp> list = session.selectList("test.findAll");
		System.out.println(list);
		session.close();
	}
	
	@Test
	public void test03() { //�飺����id���в�ѯ
		Emp emp = session.selectOne("test.findById",35);
		System.out.println(emp);
		session.close();
	}
	
	@Test
	public void test06() { //�飺����id���в�ѯ,������Map
		Map data = session.selectOne("test.findById2",3);
		System.out.println(data);
		System.out.println(data.get("name"));//�ֶ���ע���Сд
		session.close();
	}
	
	@Test
	public void test04() { //��
		Emp emp = session.selectOne("test.findById",42);//�޸�֮ǰ�Ȳ���
		if(emp!=null) {
			System.out.println(emp);
			emp.setAge(33);
			emp.setName("����1");
			session.update("test.modify",emp);
			session.commit();
			session.close();
		}
		
	}
	
	@Test
	public void test05() { //ɾ
		session.delete("test.delete",42);
		session.commit();
		session.close();
	}
	
	@Test
	public void test08() { //ʹ��resultMap���ʵ��������ֶ�����һ�µ����
		Emp2 emp2 = session.selectOne("test.findById3",3);
		System.out.println(emp2);
		session.close();
	}
}
