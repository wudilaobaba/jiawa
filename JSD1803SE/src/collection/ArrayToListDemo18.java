package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类：Arrays提供了一个静态方法asList
 * 该方法可以将给定的数组转换为一个List集合
 * @author Administrator
 *
 */
public class ArrayToListDemo18 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		System.out.println(list.size());
		
		/*
		 * 对数组转换的集合进行操作，就是对原数组的操作,但是不可以进行增删操作，因为会导致数组扩容或缩容，
		 * 那样就无法表示原数组了！！！
		 */
		list.set(1, "2");
//		list.add("five");//报错
		array[0] = "555";//对原数组进行直接操作，那么对应的转换的集合也跟着变
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
		//想要进行增删，就new一个集合并将原集合传入即可
		/*
		 * 所有集合都支持一个参数为Collection的构造方法：作用是在创建当前集合的同时包含给定集合中的所有元素	
		 */
		List<String> list2 = new ArrayList<String>(list);
		list2.add("five");
		System.out.println(list);
	}
}
