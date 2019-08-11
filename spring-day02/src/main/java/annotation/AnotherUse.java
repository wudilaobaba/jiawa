package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("other")
public class AnotherUse {
	//set方式依赖注入的另一种写法，以下两行加到所有属性前面,并且可以没有set方法
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