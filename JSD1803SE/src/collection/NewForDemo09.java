package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ʹ����ѭ����������
 * @author Administrator
 *
 */
public class NewForDemo09 {

	public static void main(String[] args) {
		Collection c = new ArrayList(); //�����е�ÿ��Ԫ��Ĭ����ΪObject����
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);
		/*
		 * ��ѭ���Ǳ������Ͽɣ�������JVM�Ͽɣ��������Ὣ��ѭ���������ϸ�Ϊ��ͨ������ѭ��������
		 * �����ڱ��������в���ͨ�����ϵķ�����ɾԪ�ء�
		 */
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
		}
	}

}
