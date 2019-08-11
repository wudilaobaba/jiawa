package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("res")
public class Restrant {
	private Waiter wt;
	
	@Autowired //��ע������ע������ΪWaiter�Ķ���
	public void setWt(@Qualifier("wt") Waiter wt) { //��ȷ˵����ע��Ķ����idΪwt
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
