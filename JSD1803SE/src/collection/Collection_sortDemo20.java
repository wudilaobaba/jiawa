package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ���Ԫ�صļ���
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
		 * Collections��sort���������򼯺�ʱҪ�󼯺�Ԫ�ر���ʵ��Comparable�ӿڡ�
		 */
		Collections.sort(list);
		//61 53 145 10 20
		System.out.println(list);
	}

}
