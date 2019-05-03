package oo.day02;
/**
 * 一个文件中可以包含多个类(但是不建议  建议一个文件中只包含一个class)
 * 一个文件中最多只能包含一个public类   (类与类、方法与方法都是并列的)
 * public修饰的类必须与当前文件名相同
 */

public class OverloadDemo {
	public static void main(String[] args) {
		//重载
		Aoo a = new Aoo();
		a.say(25);
		
		//构造
		Boo b = new Boo("王忠",45);
		System.out.println(b.name);
		System.out.println(b.age);
		Coo c = new Coo(10);//构造函数有参必须传参！！！！！！！
	
		//this
		Doo d = new Doo("会员号",26);
		d.address = "北京市区";
		d.study();
	}

}
//方法的重载演示
class Aoo{
	void say(){}
	void say(String name){}
	void say(int age){}
	void say(String name,int age){}
	void say(int age,String name){}
	//int say(){return 1} //编译错误 重载与返回值无关
	//void say(String address){} //编译错误 重载与参数名无关
}

//构造方法
class Boo{
	String name;
	int age;
	Boo(String name,int age){
		this.age = age;
		System.out.println(name+age);
	}
}
class Coo{
	String name;
	int age;
	Coo(int a){
		
	}
}

//this
class Doo{
	String name;
	int age;
	String address;
	Doo(String name,int age){
		//成员变量与局部变量可以重名，使用的时候采用就近原则，下面的name/age全是就近的局部变量，没有意义;建议给成员变量加this.
		//name = name;
		//age = age;
		this.name = name;
		this.age = age;
	}
	void study(){
		System.out.println(name+"在--"+address+" 学习");//这里的name只能使用成员变量的name,用不了局部变量name,所以可以省去this.
		//相当于:
		//System.out.println(this.name+"在学习");
	}
}
//this的使用原则，变量与成员变量同名，那么就要加this;成员变量与其他变量能区别开来的话就不用写this.
