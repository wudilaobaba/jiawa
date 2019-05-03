package oo.day05;

public class Aoo {
	public int a;    //任何类中
	protected int b; //本类中、子类中、同包类中
	int c;           //本类中、同包类中
	private int d;   //本类中
	
	void show(){
		a = 1;
		b = 2;
		c = 3;
		d = 4;
	}
}

class Boo{ //演示private
	void show(){
		Aoo o = new Aoo();
		o.a = 1;
		o.b = 2;
		o.c = 3;
		//o.d = 4; //报错！
	}
}

class Foo extends Aoo{
	void show(){
		c = 100;
	}
}
