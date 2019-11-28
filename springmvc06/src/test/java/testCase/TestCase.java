package testCase;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.AdminDao;
import entity.Admin;
import service.LoginService;

public class TestCase {
	private ApplicationContext ac;
	@Before
	//@Before修饰的方法会在测试方法执行之前先执行 
	public void init() {
		ac = new ClassPathXmlApplicationContext("springmvc.xml");
	}
	@Test
	public void test1() throws SQLException{
		DataSource ds = ac.getBean("ds",DataSource.class);
		System.out.println(ds.getConnection());
	}
	
	//测试持久层
	@Test
	public void test2() {
		AdminDao dao = ac.getBean("adminDao",AdminDao.class);
		Admin admin = dao.findByAdminCode("2");
		System.out.println(admin);
	}
	
	//测试业务层
	@Test
	public void test3() {
		LoginService l = ac.getBean("loginService",LoginService.class);
		Admin admin = l.checkLogin("3","7809");
		System.out.println(admin);
	}
}
