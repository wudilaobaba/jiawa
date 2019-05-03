package oo.day09;
//½Ó¿ÚÁ·Ï°Ìâ
public class TestInterface {
	
	public static void main(String[] args) {
		Inter04 o1 = new Eoo();

	}

}

interface Inter01{
	double PI = 3.14;
	void show();
}
interface Inter02{
	void a();
	void b();
}
interface Inter03{
	void c();
}
class Xoo implements Inter02,Inter03{
	public void a(){}
	public void b(){}
	public void c(){}
}
interface Inter04 extends Inter03{
	void e();
}
class Eoo implements Inter04{
	public void c(){}
	public void e(){}
}