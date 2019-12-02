package test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.whj.project.dao.EmpDAO;
import com.whj.project.entity.Emp;

public class TestCase {
	private EmpDAO dao;
	@Before
	public void init() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springmvc.xml");
		dao = ac.getBean("eDAO",EmpDAO.class);
	}
	@Test
	/**
	 * 查询全部
	 */
	public void test01() {
		List<Emp> lists = dao.findAll();
		System.out.println(lists);
	}
	
	@Test
	/**
	 * 查询单个
	 */
	public void test02() {
		Emp emp = dao.findById(6);
		System.out.println(emp);
	}
	
	@Test
	/**
	 * 查询单个，字段名与数据库字段名不一样
	 * 或者 返回map类型的结果
	 */
	public void test03() {
//		Emp2 emp2 = dao.findById3(6);
//		System.out.println(emp2);
		Map<String,Object> map = dao.findById2(6);
		System.out.println(map);
	}
	
	@Test
	/**
	 * 增
	 */
	public void test05() {
		Emp emp = new Emp();
		emp.setAge(10);
		emp.setName("Jhon");
		dao.save(emp);
	}
	
	@Test
	/**
	 * 删
	 */
	public void test06() {
		dao.delete(57);
	}
	
	@Test
	/**
	 * 改
	 */
	public void test07() {
		Emp emp = dao.findById(55);
		if(emp!=null) {
			emp.setAge(4);
			emp.setName("Mike");
			dao.modify(emp);
		}else {
			System.out.println("查无此人");
		}
	}
}
