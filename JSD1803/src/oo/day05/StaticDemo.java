package oo.day05;
//static的演示
public class StaticDemo {

	public static void main(String[] args) {
		Loo o1 = new Loo();
		o1.show();
		Loo o2 = new Loo();
		o2.show();
		Loo o3 = new Loo();
		o3.show();
		System.out.println(Loo.b);//访问静态变量 //建议！！！
		System.out.println(o1.b);//访问静态变量  //非常不建议！！！
		
		Xoo o4 = new Xoo();
		Xoo o5 = new Xoo();
	}

}

class Moo{//演示静态方法
	int a;
	static int b;
	void show(){//实例方法  有this
		System.out.println(a);
		System.out.println(b);
	}
	static void test(){//静态方法  没this
		//System.out.println(a);//a是实例变量,必须由实例去使用，但是静态方法中没有this,所以编译错误
		System.out.println(b);
	}
}

class Loo{//演示静态变量
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show(){
		System.out.println("a="+a+";"+"b="+b);
	}
}


class Xoo{//演示静态块
	static {
		System.out.println("静态块");
	}
	Xoo(){
		System.out.println("构造方法");
	}
}