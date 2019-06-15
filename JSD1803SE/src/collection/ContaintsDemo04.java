package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合存放的是元素的引用
 * @author Administrator
 *
 */
public class ContaintsDemo04 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Point p = new Point(1,2);
		c.add(p);
		System.out.println(c);
		System.out.println(p);
		p.setX(2);
		System.out.println(c);
		System.out.println(p);
	}
}
