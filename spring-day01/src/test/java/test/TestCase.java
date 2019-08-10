package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.A;
import ioc2.AA;
import ioc2.Restrarant;
import iocTest.LoginService;
import scope.ExampleBean;
import scope.MessageBean;
import scope.ScopeBean;
import value.ValueBean;

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
	
	@Test
	//测试构造器方式注入
	public void Test7(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		AA aa = ac.getBean("aa",AA.class);
		aa.excute();
	}
	
	@Test
	//测试自动装配
	public void Test8(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		Restrarant rest = ac.getBean("rest",Restrarant.class);
		System.out.println(rest);
	}
	
	@Test
	//测试注入基本类型
	public void Test9(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		ValueBean vb1 = ac.getBean("vb1",ValueBean.class);
		System.out.println(vb1);
	}
}
