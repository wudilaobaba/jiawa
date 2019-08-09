package scope;

public class ExampleBean {
	public ExampleBean(){
		System.out.println("无参构造");
	}
	public void init(){
		System.out.println("初始化");
	}
	public void destory(){
		System.out.println("销毁了");
	}
}
