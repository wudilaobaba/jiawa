package annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//07 组件
@Component("sb1") //相当于在spring容器中有一个id为sb1的bean , 若@Component，即不写括号，那么缺省值为类名但首字母小写someBean
//@Scope("prototype")//该注解用来指定作用域 ,缺省值为"singleton"（单例模式）
//@Lazy(true)//表示启用延迟加载 缺省值为false
public class SomeBean {
	@PostConstruct //表示自动执行初始化方法
	public void init(){
		System.out.println("init()");
	}
	
	@PreDestroy //表示销毁之前自动执行销毁方法
	public void destroy(){
		System.out.println("执行了销毁方法！"); //单例模式下才会执行销毁方法
	}
	
	public SomeBean(){
		System.out.println("SomeBean()");
	}
	
	
}
