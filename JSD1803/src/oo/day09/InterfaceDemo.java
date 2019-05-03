package oo.day09;
//接口的演示
public class InterfaceDemo {

	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.show();

	}

}

//接口的语法
interface Inter1{
	double PI = 3.14;
	void show();
	
}
interface Inter2{
	void say();
	
}
abstract class Boo{
	abstract void test();
}
class Aoo extends Boo implements Inter1,Inter2{
	public void show(){
		System.out.println(PI);
	}
	public void say(){
		System.out.println("414");
	}
	public void test(){
		System.out.println("4");
	}
}



interface Inter3{
	void show();
}
interface Inter4 extends Inter3,Inter2{  //接口类型可以多继承
	void sing();
}
class Foo implements Inter4{
	public void show(){};
	public void sing(){};
	public void say(){};
}


