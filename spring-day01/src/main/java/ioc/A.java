package ioc;

/**
 * 使用spring的依赖注入以后，代码就不要轻易改动了
 * 以后改配置文件，不要改源代码
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
