package annotation;

import org.springframework.stereotype.Component;

//07 ���
@Component("sb1") //�൱����spring��������һ��idΪsb1��bean , ��@Component������д���ţ���ôȱʡֵΪ����������ĸСдsomeBean
public class SomeBean {
	public SomeBean(){
		System.out.println("SomeBean()");
	}
}
