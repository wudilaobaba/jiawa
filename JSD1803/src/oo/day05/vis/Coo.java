package oo.day05.vis;
import oo.day05.Aoo;
public class Coo {//演示同包的概念
	void show(){
		Aoo o = new Aoo();
		o.a = 1;
		//o.b = 1;//编译错误
		//o.c = 1;//编译错误
		//o.d = 1;//编译错误
	}
}

class Doo extends Aoo{ //演示protected
	void show(){
		super.a = 1;
		super.b = 1;
		//super.c = 1; //c是默认的成员变量，只能在本类中或同包类中访问
		//super.d = 1;
	}
}

