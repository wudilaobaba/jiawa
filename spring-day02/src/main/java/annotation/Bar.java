package annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("bar")
public class Bar {
	//@Resource(name="wt") //name���ԣ�ָ�������id   Ҳ���Լӵ�����ǰ��
	private Waiter wt;
	public Bar(){
		System.out.println("Waiter()");
	}
	@Resource(name="wt") //name���ԣ�ָ�������id
	public void setWt(Waiter wt) {
		System.out.println("setWt()");
		this.wt = wt;
	}
	@Override
	public String toString() {
		return "Bar [wt=" + wt + "]";
	}
	
}
