package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用反射机制调用某个类实例的方法
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("要实例化的类名");
		String className = scan.nextLine();
		System.out.println("要调用的方法名");
		String methodName = scan.nextLine();
		
		/*
		 * Class提供了获取其表示的类相关信息的一组方法，其中：
		 * Method getDeclaredMethod(String name,Class[] args)是获取当前Class所表示的类定义的指定名字以及参数列表的方法
		 * Method是反射API中一个重要的类
		 * 其每一个实例用于表示某个类的一个具体方法
		 * 通过Method可以获取到其表示的方法的相关信息，如：方法名、返回值类型、参数类型、访问修饰符等
		 * 并且也可以通过Method动态调用其表示的方法
		 * 
		 * getMethods();  //获取该类的所有方法，包括继承的方法
		 * getDeclaredMethods(); //仅仅是获取该类中自己定义的所有方法
		 * 
		 * 
		 * 
		 */
		
		//1.实例化
		Class cls = Class.forName(className);//"reflect.Person02"
		Object obj = cls.newInstance();
		//获取Person的sayHello方法
		Method[] y = cls.getDeclaredMethods();//获取该类中的所有方法,是Method数组类型
		//2.调用该对象的方法
		Method m = cls.getDeclaredMethod(methodName, null);//获取其中一个方法（无参方法）  //"sayHello"
		/*
		 * Method的invoke方法是用来调用当前Method所表示的方法
		 * 参数1.由于成员方法所属对象，那么调用Method所表示的方法时要传入该方法所属对象
		 * 参数2.实参，若该方法无参，则传入null即可
		 */
		m.invoke(obj, null);//调用方法,调用的是obj的sayHi方法,第二个参数是实参
		
	}
}
