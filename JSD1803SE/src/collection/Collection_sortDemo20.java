package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义元素的集合
 * @author Administrator
 *
 */
public class Collection_sortDemo20 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(5,6));
		list.add(new Point(2,7));
		list.add(new Point(8,9));
		list.add(new Point(1,3));
		list.add(new Point(4,2));
		System.out.println(list);
		/**
		 * Collections的sort方法在排序集合时要求集合元素必须实现Comparable接口。
		 */
		Collections.sort(list);
		//61 53 145 10 20
		System.out.println(list);
	}

}
