package reflect;

import java.util.Scanner;

/**
 * 测试，交换不同的类名，依靠反射机制实例化该类实例
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入类名"); //输入java.util.HashMap  试试
		String className = scan.nextLine();
		/*
		 * Class.formName(String className)
		 * 可以传入的类只要在类路径下的类都可以的
		 * 例如，我们当前项目中src里任意包中的类以及API中java提供的类
		 * java.util.HashMap
		 * java.util.ArrayList
		 * reflect.Emp03
		 * reflect.Person02
		 */
		Class cls = Class.forName(className);
		Object obj = cls.newInstance();
		System.out.println(obj);
	}
}
