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
		//以下三行获取SqlSession对象
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
		session = ssf.openSession();
	}
	@Test
	public void test01() {
		/**
		 * getMapper返回一个符合mapper映射器中要求的EmpDAO对象
		 */
		//增：
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp emp = new Emp();
		emp.setName("大神323");
		emp.setAge(66);
		dao.save(emp);
		session.commit();
		session.close();
	}

	@Test
	/**
	 * 查询所有
	 */
	public void test02() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		List<Emp> lists = dao.findAll();
		System.out.println(lists);
		session.close();
	}

	@Test
	/**
	 * 根据ID查询
	 */
	public void test03() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp emp = dao.findById(3);
		System.out.println(emp);
		session.close();
	}
	
	@Test
	/**
	 * 查：根据id进行查询，并返回Map类型的结果
	 */
	public void test06() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Map<String,Object> map = dao.findById2(6);
		System.out.println(map);
		session.close();
	}
	
	@Test
	/**
	 * 查：根据id进行查询，实体的参数名与数据库字段名不一致的情况：
	 */
	public void test07() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		Emp2 emp2 = dao.findById3(55);
		System.out.println(emp2);
		session.close();
	}

	@Test
	/**
	 * 改：
	 */
	public void test04() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		//改之前先查询
		Emp emp = dao.findById(4);
		if(emp!=null) {
			emp.setAge(1);
			emp.setName("神仙111");
			dao.modify(emp);
			session.commit();
			session.close();
		}else {
			System.out.println("员工不存在");
		}
	}

	@Test
	/**
	 * 删：
	 */
	public void test05() {
		EmpDAO dao = session.getMapper(EmpDAO.class);
		for(int i=34;i<54;i++) {
			//删之前先查询
			Emp emp = dao.findById(i);
			if(emp!=null) {
				dao.delete(i);
				session.commit();
				session.close();
			}else {
				System.out.println("员工不存在");
			}
		}
	}
	
	
}
