package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ɾ������Ԫ��
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
		 * 01.removeһ��ֻ��ɾ��һ��Ԫ��
		 * 02.remove�Ƚ���equales�����жϣ�Ȼ����ɾ
		 */
		c.remove(p);
		System.out.println(c);
	}

}
