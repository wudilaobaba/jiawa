package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ��,�жϵı�׼��equals
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
		 * �������ø���Ԫ���뼯������Ԫ�ؽ���equals�Ƚϣ����бȽ�Ϊtrue������Ϊ���ϰ�����Ԫ�ء�
		 * ����Ԫ�ص�equals����ֱ��Ӱ�켯�ϵ�contains�����Ľ����
		 */
		System.out.println(c.contains(p));
	}
}
