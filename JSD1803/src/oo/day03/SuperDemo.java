package oo.day03;
//超类super的理解
public class SuperDemo {
	public static void main(String[] args) {
		Boo b = new Boo();

	}
}

class Aoo{
	Aoo(int a){
		System.out.println("超类构造方法"+a);
	}
	Aoo(){
		System.out.println("超类构造方法");
	}
}

class Boo extends Aoo{
	Boo(){
		//super(12);//若超类的构造函数中有参数，那么不主动调用派生类的构造函，就会报错
		//只会主动调用超类的无参构造函数
		System.out.println("派生类构造方法");
	}
}