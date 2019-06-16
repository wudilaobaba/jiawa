package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合间操作
 * @author Administrator
 *
 */
public class Collection06 {

	public static void main(String[] args) {
		Collection c = new ArrayList();//List集合允许有重复元素
		c.add("java");
		c.add("c");
		c.add(".net");
		System.out.println("c:"+c);
		
		Collection c2 = new HashSet(); //set集合不允许有重复元素，且无序
		c2.add("php");
		c2.add("android");
		System.out.println("c2:"+c2);
		
		/*
		 * boolean addAll(Collection c)
		 * 将给定集合中的所有元素添加到当前集合中
		 */
//		c.addAll(c2);
//		System.out.println(c);
		
		c2.addAll(c); //只要当前集合元素发生改变了，就返回true
		System.out.println("c2:"+c2);
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("c");
		System.out.println("c3:"+c3);
		/*
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		System.out.println("c是否全包含c3:"+c.containsAll(c3)); //判断c是否全包含c3
		
		/*
		 * boolean removeAll(Collection c)
		 * 删除当前集合中与给定集合的交集部分
		 */
		c.removeAll(c3);
		System.out.println("c:"+c);
	}

}
