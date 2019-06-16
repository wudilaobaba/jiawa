package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * jiava.util.List�ӿ�
 * List�ǿ����ظ����������ṩ��һ�����ͨ���±����Ԫ�صķ�����
 * ����ʵ���ࣺ
 * java.util.ArrayList
 * ���ڲ�����ʵ�֣���ѯЧ�ʸ���
 * 
 * java.util.LinkedList
 * ���ڲ�����ʵ�֣���ɾЧ�ʸ��ã���β��ɾԪ��Ч�����
 * @author Administrator
 *
 */
public class ListDemo14 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("one3");
		list.add("one4");
		System.out.println(list);
		/*
		 * E get(int index)
		 * ��ȡָ��λ�ö�Ӧ��Ԫ��
		 */
		//��ȡ�ڶ���Ԫ��
		String str = list.get(1);
		System.out.println(str);
		System.out.println("---------------------");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		/*
		 * E set(int index,E e) �±��ֹԽ�磡��������
		 * ��ָ��Ԫ�����õ�ָ��λ�ã�����ֵΪԭλ�ö�Ӧ��Ԫ��
		 * set������ʵ���������滻Ԫ�ز���
		 */
		//one 2 one3  one4
		String t = list.set(1, "2");
		System.out.println(t);
		System.out.println(list);
	}
}
