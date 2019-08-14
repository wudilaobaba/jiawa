package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mg")
public class Manger {
	//@Value("#{config.pagesize}") //获取config.properties文件中的值
	private String pageSize;
	
	private int age;
	
	@Value("花千骨") //直接给name属性赋值
	private String name;
	
	@Value("21") //@Value可以加到set方法前
	public void setAge(int age){
		this.age = age;
	}

	@Override
	public String toString() {
		return "Manger [pageSize=" + pageSize + ", age=" + age + ", name=" + name + "]";
	}

}
