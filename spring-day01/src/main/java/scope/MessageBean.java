package scope;

public class MessageBean {
	public MessageBean(){
		System.out.println("MessageBean()");
	}
	//���������Ժ��ȵ��ø÷���
	public void init(){
		System.out.println("init()");
	}
	
	public void sendMsg(){
		System.out.println("sendMsg()");
	}
	
	//���ٶ���֮ǰ���ȵ��ø÷���
	public void destroy(){
		System.out.println("destroy()");
	}
}
