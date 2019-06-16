package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection提供了方法：toArray
 * 该方法可以将当前集合转换为一个数租
 * @author Administrator
 *
 */
public class CollectionToArrayDemo17 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
//		Object[] array = c.toArray(); 一般不这么用
		
		String[] array = c.toArray(new String[c.size()-1]); //长度不够依然取原数组，但泛型必须一致
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
	}
}
