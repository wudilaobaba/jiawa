package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import scope.ScopeBean;

public class TestCase {
	@Test
	//测试作用域
	public void test1(){
		//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		//获得对象
		ScopeBean s1 = ac.getBean("s1",ScopeBean.class);
		ScopeBean s2 = ac.getBean("s1",ScopeBean.class);
		//
		System.out.println(s1==s2);
	}
}
