package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mg")
public class Manger {
	//@Value("#{config.pagesize}") //��ȡconfig.properties�ļ��е�ֵ
	private String pageSize;
	
	private int age;
	
	@Value("��ǧ��") //ֱ�Ӹ�name���Ը�ֵ
	private String name;
	
	@Value("21") //@Value���Լӵ�set����ǰ
	public void setAge(int age){
		this.age = age;
	}

	@Override
	public String toString() {
		return "Manger [pageSize=" + pageSize + ", age=" + age + ", name=" + name + "]";
	}

}
