package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.Restrant;

public class TestCase {
	@Test
	public void Test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Restrant res = ac.getBean("res",Restrant.class);
		System.out.println(res);
	}
}
