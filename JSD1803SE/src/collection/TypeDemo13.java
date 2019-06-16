package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型常见面试题
 * @author Administrator
 *
 */
public class TypeDemo13 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		for(int i: c1){
			System.out.println(i);
		}
		//集合建议全部使用泛型，否则会出现异常
		Collection c2 = c1;
		c2.add("four");
		for(int i: c1){
			System.out.println(i);
		}
	}
}
