package scope;

public class MessageBean {
	public MessageBean(){
		System.out.println("MessageBean()");
	}
	//创建对象以后，先调用该方法
	public void init(){
		System.out.println("init()");
	}
	
	public void sendMsg(){
		System.out.println("sendMsg()");
	}
	
	//销毁对象之前，先调用该方法
	public void destroy(){
		System.out.println("destroy()");
	}
}
