package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历集合
 * @author Administrator
 *
 */
public class NewForDemo09 {

	public static void main(String[] args) {
		Collection c = new ArrayList(); //集合中的每个元素默认视为Object类型
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);
		/*
		 * 新循环是编译器认可，而不是JVM认可，编译器会将新循环遍历集合改为普通迭代器循环遍历。
		 * 所以在遍历过程中不能通过集合的方法增删元素。
		 */
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
		}
	}

}
