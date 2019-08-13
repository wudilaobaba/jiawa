package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.AnotherUse;
import annotation.Bar;
import annotation.Restrant;
import annotation.School;

public class TestCase {
	@Test
	public void Test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Restrant res = ac.getBean("res",Restrant.class);
		System.out.println(res);
	}
	
	@Test //测试另一种set方式的注解方式的注入
	public void Test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		AnotherUse other = ac.getBean("other",AnotherUse.class);
		System.out.println(other);
	}
	
	@Test //测试构造器方式的注解方式的注入
	public void Test3(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		School school = ac.getBean("school",School.class);
		System.out.println(school);
	}
	
	@Test //测试@Resource的set方式的注解方式的注入
	public void Test4(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Bar bar = ac.getBean("bar",Bar.class);
		System.out.println(bar);
	}
	
}
