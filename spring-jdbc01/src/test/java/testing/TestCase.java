package testing;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.whj.project.entity.Emp;
import com.whj.project.service.LoginService;

public class TestCase {
	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springmvc.xml");
		LoginService service = ac.getBean("service",LoginService.class);
		
	}
}
