package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���ϵĹ�����
 * ���ϵĹ����ࣺjava.util.Collections
 * �ṩ�˺ܶྲ̬���������ڲ�������
 * @author Administrator
 *
 */
public class Collection_sortDemo19 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		Collections.sort(list);
		System.out.println("˳��"+list);
		Collections.shuffle(list);
		System.out.println("����"+list);
	}
}
