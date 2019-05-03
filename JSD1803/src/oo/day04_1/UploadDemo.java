package oo.day04_1;
//向上造型
public class UploadDemo {

	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.a = 1;
		//o1.b = 2; //编译错误  超类不可以访问派生类
		
		Boo o2 = new Boo();
		o2.b = 1;
		o2.test();
		o2.a = 2; //派生类可以访问超类的
		o2.show();
		
		//Boo o3 = new Aoo();//编译错误
		
		Aoo o4 = new Boo(); //向上造型
		o4.a = 1;
		o4.show();
		//o4.b = 1; //编译错误  能点出来什么要看超类有什么
		//o4.test();//编译错误  能点出来什么要看超类有什么
	}

}

class Aoo{
	int a;
	void show(){
		
	}
}

class Boo extends Aoo{
	int b;
	void test(){
		
	}
}