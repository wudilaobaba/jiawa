package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϼ����
 * @author Administrator
 *
 */
public class Collection06 {

	public static void main(String[] args) {
		Collection c = new ArrayList();//List�����������ظ�Ԫ��
		c.add("java");
		c.add("c");
		c.add(".net");
		System.out.println("c:"+c);
		
		Collection c2 = new HashSet(); //set���ϲ��������ظ�Ԫ�أ�������
		c2.add("php");
		c2.add("android");
		System.out.println("c2:"+c2);
		
		/*
		 * boolean addAll(Collection c)
		 * �����������е�����Ԫ����ӵ���ǰ������
		 */
//		c.addAll(c2);
//		System.out.println(c);
		
		c2.addAll(c); //ֻҪ��ǰ����Ԫ�ط����ı��ˣ��ͷ���true
		System.out.println("c2:"+c2);
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("c");
		System.out.println("c3:"+c3);
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 */
		System.out.println("c�Ƿ�ȫ����c3:"+c.containsAll(c3)); //�ж�c�Ƿ�ȫ����c3
		
		/*
		 * boolean removeAll(Collection c)
		 * ɾ����ǰ��������������ϵĽ�������
		 */
		c.removeAll(c3);
		System.out.println("c:"+c);
	}

}
