package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK1.5之后推出了一个特性：泛型
 * 泛型又称之为参数化类型，允许调用者在调用某个类的功能时传入一个或多个类型来定义该类型属性，
 * 方法的参数以及返回值的类型。这大大的提高了代码的灵活度。
 * 泛型应用最广泛的地方就是集合，用来指定集合中的元素类型。
 * @author Administrator
 *
 */
public class TypeDemo10 {
	public static void main(String[] args) {
		//泛型的原形就是Object
		Collection<String> c = new ArrayList<String>();
		//编译器检测实参类型是否符合泛型要求
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
//		c.add(1); //编译不通过
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			//迭代器进行泛型后，无需再造型,编译器会自动添加造型代码
			String str = it.next();
			System.out.println(str);
		}
		for(String str: c){
			System.out.println(str);
		}
	}

}
