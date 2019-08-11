package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("res")
public class Restrant {
	private Waiter wt;
	
	@Autowired //该注解用来注入类型为Waiter的对象
	public void setWt(@Qualifier("wt") Waiter wt) { //明确说明被注入的对象的id为wt
		System.out.println("setWt()");
		this.wt = wt;
	}

	public Restrant() {
		System.out.println("Restrant()");
	}

	@Override
	public String toString() {
		return "Restrant [wt=" + wt + "]";
	}
	
	
	
}
