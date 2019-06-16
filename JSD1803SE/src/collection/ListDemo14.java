package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * jiava.util.List接口
 * List是可以重复集且有序，提供了一组可以通过下标操作元素的方法。
 * 常用实现类：
 * java.util.ArrayList
 * 有内部数组实现，查询效率更好
 * 
 * java.util.LinkedList
 * 由内部链表实现，增删效率更好，首尾增删元素效率最好
 * @author Administrator
 *
 */
public class ListDemo14 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("one3");
		list.add("one4");
		System.out.println(list);
		/*
		 * E get(int index)
		 * 获取指定位置对应的元素
		 */
		//获取第二个元素
		String str = list.get(1);
		System.out.println(str);
		System.out.println("---------------------");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		/*
		 * E set(int index,E e) 下标禁止越界！！！！！
		 * 将指定元素设置到指定位置，返回值为原位置对应的元素
		 * set方法的实际意义是替换元素操作
		 */
		//one 2 one3  one4
		String t = list.set(1, "2");
		System.out.println(t);
		System.out.println(list);
	}
}
