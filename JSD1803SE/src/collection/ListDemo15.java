package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List �ṩ��һ�����ص�add,remove����
 * @author Administrator
 *
 */
public class ListDemo15 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * void add(int index,E e)
		 * ������Ԫ�ز��뵽ָ��λ��
		 */
		//[one,two,2,three,four]
		list.add(2,"2");
		System.out.println(list);
		System.out.println("-----------------------------");
		
		/*
		 * E remove(int index)
		 * ɾ����ǰ������ָ��λ�õ�Ԫ�ز����䷵��
		 */
		System.out.println(list.remove(1));
		System.out.println(list);
		
		
	}
}
