package ioc;

/**
 * ʹ��spring������ע���Ժ󣬴���Ͳ�Ҫ���׸Ķ���
 * �Ժ�������ļ�����Ҫ��Դ����
 * @author Administrator
 *
 */
public class A {
	private IB ib;
	public A(){
		System.out.println("A()");
	}
	public void setIB(IB ib) {
		System.out.println("setIB()");
		this.ib = ib;
	}
	
	
	public void execute(){
		System.out.println("execute()");
		ib.f1();
	}
}
