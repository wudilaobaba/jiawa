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
	
	@Test //������һ��set��ʽ��ע�ⷽʽ��ע��
	public void Test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		AnotherUse other = ac.getBean("other",AnotherUse.class);
		System.out.println(other);
	}
	
	@Test //���Թ�������ʽ��ע�ⷽʽ��ע��
	public void Test3(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		School school = ac.getBean("school",School.class);
		System.out.println(school);
	}
	
	@Test //����@Resource��set��ʽ��ע�ⷽʽ��ע��
	public void Test4(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Bar bar = ac.getBean("bar",Bar.class);
		System.out.println(bar);
	}
	
}
