package ioc2;

public class AA {
	private BB b;
	
	public AA(BB b) {
		System.out.println("AA(BB)");
		this.b = b;
	}
	public AA(){
		System.out.println("AA()");
	}
	public void excute(){
		System.out.println("excute()");
		b.f1();
	}
}
