package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import scope.ScopeBean;

public class TestCase {
	@Test
	//����������
	public void test1(){
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		//��ö���
		ScopeBean s1 = ac.getBean("s1",ScopeBean.class);
		ScopeBean s2 = ac.getBean("s1",ScopeBean.class);
		//
		System.out.println(s1==s2);
	}
}
