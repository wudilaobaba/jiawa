package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * Collection�ṩ�˷�����toArray
 * �÷������Խ���ǰ����ת��Ϊһ������
 * @author Administrator
 *
 */
public class CollectionToArrayDemo17 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
//		Object[] array = c.toArray(); һ�㲻��ô��
		
		String[] array = c.toArray(new String[c.size()-1]); //���Ȳ�����Ȼȡԭ���飬�����ͱ���һ��
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
	}
}
