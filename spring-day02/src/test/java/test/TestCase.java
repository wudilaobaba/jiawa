package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.AnotherUse;
import annotation.Restrant;

public class TestCase {
	@Test
	public void Test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Restrant res = ac.getBean("res",Restrant.class);
		System.out.println(res);
	}
	
	@Test //������һ��set��ʽ��ע�ⷽʽ��ע��
	public void Test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		AnotherUse other = ac.getBean("other",AnotherUse.class);
		System.out.println(other);
	}
	
}
