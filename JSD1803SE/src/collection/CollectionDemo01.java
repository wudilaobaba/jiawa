package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.collection
 * Collection是所有集合的顶级接口，规定了所有集合都应当具备的方法
 * 其下有两个常用的派生接口：
 * java.util.List: 可重复集合，并且有序
 * java.util.Set: 不可重复集合
 * 重复指的是元素是否可以重复，而重复的标准是元素自身equals比较的结果是否为true
 * @author Administrator
 *
 */
public class CollectionDemo01 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * 向当前集合中添加一个元素，成功添加则返回true
		 */
		c.add("one"); //该add方法添加成功，则返回true
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		int size = c.size();
		System.out.println(size);
		
		/*
		 * boolean isEmpty()
		 * 判断当前集合是否为空集合(不含有任何元素)
		 */
		//当size为0时，c.isEmpty()返回true
		System.out.println(c.isEmpty());
		
		/*
		 * 清空集合
		 */
		c.clear();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c);
	}

}
