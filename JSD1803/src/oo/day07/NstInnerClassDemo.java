package oo.day07;
//匿名内部类的演示
public class NstInnerClassDemo {

	public static void main(String[] args) {
		//1)创建了Coo的派生类(就是个匿名内部类)，但是没有名字 假设Doo   
		//2)为该派生类创建了一个对象o1，只能创建一个对象
		//3)大括号中为派生类的类体，如果超类中有抽象方法，那么在此必须重写
		Coo o1 = new Coo(){ //o1的类型是派生类Doo类型
			
		};
		
		//1)创建了Coo的派生类(就是个匿名内部类)，但是没有名字 假设Eoo
		//2)为该派生类创建了一个对象o2，只能创建一个对象
		//3)大括号中为派生类的类体，如果超类中有抽象方法，那么在此必须重写
		Coo o2 = new Coo(){ //o2的类型是派生类Eoo类型
			
		};
		
		
		//抽象类想造一个匿名内部类必须 new Coo(){} 加大括号
		//普通类加大括号造一个匿名内部类也不报错
		
		//抽象类不能被实例化，实在想实例化就继承后再实例化，如FlyingObject
		
		
		int num = 5;
		Doo o3 = new Doo(){
			void show(){
				System.out.println("show show");
				System.out.println(num);
			}
		};
		o3.show();

	}

}
abstract class Doo{
	abstract void show();
}
abstract class Coo{
	int a = 10;
}