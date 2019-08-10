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
	
	@Test
	//������������
	public void test2(){
		//AbstractApplicationContext��           ApplicationContext���ӽӿ�
		//ClassPathXmlApplicationContext�� ApplicationContext��ʵ����
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		//����MessageBean��
		MessageBean m = ac.getBean("message",MessageBean.class);
		m.sendMsg();
		//�ر�������Ҫ��AbstractApplicationContext�ӿ�
		ac.close();
	}
	
	@Test
	public void test3(){
		//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		
	}
	
	@Test
	public void Test4(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		ExampleBean eb = ac.getBean("example",ExampleBean.class);
		ac.close();
	}
	
	@Test
	//����set��ʽ��ע��
	public void Test5(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		A a = ac.getBean("a1",A.class);
		a.execute();
	}
	
	@Test
	//�������һ����ϰ
	public void Test6(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		LoginService login = ac.getBean("login",LoginService.class);
		login.run();
	}
	
	@Test
	//���Թ�������ʽע��
	public void Test7(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		AA aa = ac.getBean("aa",AA.class);
		aa.excute();
	}
	
	@Test
	//�����Զ�װ��
	public void Test8(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		Restrarant rest = ac.getBean("rest",Restrarant.class);
		System.out.println(rest);
	}
	
	@Test
	//����ע���������
	public void Test9(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		ValueBean vb1 = ac.getBean("vb1",ValueBean.class);
		System.out.println(vb1);
	}
}
