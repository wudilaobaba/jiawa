package annotation;

import org.springframework.stereotype.Component;

//07 组件
@Component("sb1") //相当于在spring容器中有一个id为sb1的bean , 若@Component，即不写括号，那么缺省值为类名但首字母小写someBean
public class SomeBean {
	public SomeBean(){
		System.out.println("SomeBean()");
	}
}
