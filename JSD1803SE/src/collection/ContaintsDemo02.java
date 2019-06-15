package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(E e)
 * 判断当前集合是否包含给定元素,判断的标准是equals
 * @author Administrator
 *
 */
public class ContaintsDemo02 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(9,2));
		c.add(new Point(5,6));
		System.out.println(c);
		Point p = new Point(1,2);
		/*
		 * 集合是用给定元素与集合现有元素进行equals比较，若有比较为true的则认为集合包含该元素。
		 * 所以元素的equals方法直接影响集合的contains方法的结果。
		 */
		System.out.println(c.contains(p));
	}
}
