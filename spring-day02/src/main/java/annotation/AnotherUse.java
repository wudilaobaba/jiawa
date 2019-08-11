package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("other")
public class AnotherUse {
	//set��ʽ����ע�����һ��д�����������мӵ���������ǰ��,���ҿ���û��set����
	@Autowired
	@Qualifier("wt")
	private Waiter wt;
	public AnotherUse() {
		System.out.println("AnotherUse()");
	}
	@Override
	public String toString() {
		return "Restrant [wt=" + wt + "]";
	}
	
	
	
}