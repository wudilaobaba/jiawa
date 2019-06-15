package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除集合元素
 * @author Administrator
 *
 */
public class RemoveDemo03 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(9,2));
		c.add(new Point(5,6));
		System.out.println(c);
		Point p = new Point(1,2);
		/*
		 * 01.remove一次只能删除一个元素
		 * 02.remove先进行equales进行判断，然后再删
		 */
		c.remove(p);
		System.out.println(c);
	}

}
