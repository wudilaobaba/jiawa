package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ͳ���������
 * @author Administrator
 *
 */
public class TypeDemo13 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		//���������add�Ĳ����Ƿ�ΪInteger
		c1.add(1);
		c1.add(2);
		c1.add(3);
//		c1.add("four");//���벻ͨ����ʵ����c1�ķ��Ͳ�ƥ��
		//��ȡ����Ԫ��ʱ���������Ჹȫ���뽫Ԫ������ΪInteger
		for(int i: c1){
			System.out.println(i);
		}
		//���Ͻ���ȫ��ʹ�÷��ͣ����������쳣
		/*
		 * ��ָ������ʱ��Ĭ��Ϊԭ��Object
		 * ������c2�ĽǶȿ���c1�ļ���ʱ��Ԫ�ؾͰ���Object����
		 */
		Collection c2 = c1;
		c2.add("four");
		System.out.println("c2"+c2);
		System.out.println("c1"+c1);
		//�ٴα���c1ʱ����������쳣
		for(int i: c1){
			System.out.println(i);
		}
	}
}
