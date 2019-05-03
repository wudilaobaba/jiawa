package oo.day05;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

final class Koo extends Noo{}
//class Too extends Koo{} 别人不能继承它
class Noo{}





class Yoo{
	final void show(){}
	void say(){}
}
class Goo extends Yoo{
	//void show(){} 加了final那么无法被重写
	void say(){}
}




/*
 * final修饰成员变量
 * 1) 声明时必须赋值
 * 2) 若声明时不赋值，则要在构造方法中去赋值
 * final修饰局部变量：用之前给值就行
 */

class Eoo{
	final int num = 5;
	final int x;
	Eoo(){
		x = 10;
	}
	void show(){
		final int b;
	}
}