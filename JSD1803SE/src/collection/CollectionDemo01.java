package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.collection
 * Collection�����м��ϵĶ����ӿڣ��涨�����м��϶�Ӧ���߱��ķ���
 * �������������õ������ӿڣ�
 * java.util.List: ���ظ����ϣ���������
 * java.util.Set: �����ظ�����
 * �ظ�ָ����Ԫ���Ƿ�����ظ������ظ��ı�׼��Ԫ������equals�ȽϵĽ���Ƿ�Ϊtrue
 * @author Administrator
 *
 */
public class CollectionDemo01 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * ��ǰ���������һ��Ԫ�أ��ɹ�����򷵻�true
		 */
		c.add("one"); //��add������ӳɹ����򷵻�true
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		int size = c.size();
		System.out.println(size);
		
		/*
		 * boolean isEmpty()
		 * �жϵ�ǰ�����Ƿ�Ϊ�ռ���(�������κ�Ԫ��)
		 */
		//��sizeΪ0ʱ��c.isEmpty()����true
		System.out.println(c.isEmpty());
		
		/*
		 * ��ռ���
		 */
		c.clear();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c);
	}

}
