package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK1.5֮���Ƴ���һ�����ԣ�����
 * �����ֳ�֮Ϊ���������ͣ�����������ڵ���ĳ����Ĺ���ʱ����һ������������������������ԣ�
 * �����Ĳ����Լ�����ֵ�����͡����������˴�������ȡ�
 * ����Ӧ����㷺�ĵط����Ǽ��ϣ�����ָ�������е�Ԫ�����͡�
 * @author Administrator
 *
 */
public class TypeDemo10 {
	public static void main(String[] args) {
		//���͵�ԭ�ξ���Object
		Collection<String> c = new ArrayList<String>();
		//���������ʵ�������Ƿ���Ϸ���Ҫ��
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
//		c.add(1); //���벻ͨ��
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			//���������з��ͺ�����������,���������Զ�������ʹ���
			String str = it.next();
			System.out.println(str);
		}
		for(String str: c){
			System.out.println(str);
		}
	}

}
