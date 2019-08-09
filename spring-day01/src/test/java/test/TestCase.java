package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.A;
import iocTest.LoginService;
import scope.ExampleBean;
import scope.MessageBean;
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
	
	@Test
	//测试声明周期
	public void test2(){
		//AbstractApplicationContext是           ApplicationContext的子接口
		//ClassPathXmlApplicationContext是 ApplicationContext的实现类
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		//测试MessageBean类
		MessageBean m = ac.getBean("message",MessageBean.class);
		m.sendMsg();
		//关闭容器，要用AbstractApplicationContext接口
		ac.close();
	}
	
	@Test
	public void test3(){
		//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		
	}
	
	@Test
	public void Test4(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		ExampleBean eb = ac.getBean("example",ExampleBean.class);
		ac.close();
	}
	
	@Test
	//测试set方式的注入
	public void Test5(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		A a = ac.getBean("a1",A.class);
		a.execute();
	}
	
	@Test
	//测试最后一个练习
	public void Test6(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		LoginService login = ac.getBean("login",LoginService.class);
		login.run();
	}
}
