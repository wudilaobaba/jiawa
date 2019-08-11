package annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//07 ���
@Component("sb1") //�൱����spring��������һ��idΪsb1��bean , ��@Component������д���ţ���ôȱʡֵΪ����������ĸСдsomeBean
//@Scope("prototype")//��ע������ָ�������� ,ȱʡֵΪ"singleton"������ģʽ��
//@Lazy(true)//��ʾ�����ӳټ��� ȱʡֵΪfalse
public class SomeBean {
	@PostConstruct //��ʾ�Զ�ִ�г�ʼ������
	public void init(){
		System.out.println("init()");
	}
	
	@PreDestroy //��ʾ����֮ǰ�Զ�ִ�����ٷ���
	public void destroy(){
		System.out.println("ִ�������ٷ�����"); //����ģʽ�²Ż�ִ�����ٷ���
	}
	
	public SomeBean(){
		System.out.println("SomeBean()");
	}
	
	
}
