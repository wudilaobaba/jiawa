package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection�ṩ��ͳһ�Ļ�ȡԪ�صĲ���������
 * ����������ʹ�õ��ǵ�����ģʽ
 * Iterator iterator()
 * �÷�����ȡһ���������ڱ�����ǰ���ϵĵ�����
 * 
 * java.util.Iterator
 * Iterator��һ���ӿڣ������˵������������ϵ���ز�����������ͬ�ļ��϶��ṩ��һ��������ʵ����
 * ����������������ѭ���ʡ�ȡ��ɾ�Ĳ��裬����ɾ��Ԫ�ز��Ǳ�Ҫ������
 * @author Administrator
 *
 */
public class IteratorDemo07 {
	public static void main(String[] args) {
		Collection c = new ArrayList(); //List����Set����
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
		Iterator it = c.iterator();
		/*
		 *boolean hasNext()
		 *�жϵ�ǰ�����Ƿ���Ԫ�ؿ��Ե���
		 *
		 *E next()
		 *��ȡ��һ������Ԫ�� 
		 */
		while(it.hasNext()){//�Ƿ�����һ��Ԫ��
			String str = (String)it.next();  //�����е�ÿ��Ԫ��Ĭ����ΪObject����
			if("#".equals(str)){
				/*
				 *������Ҫ���ڱ������ϵĹ����в���ͨ�����ϵķ�����ɾԪ�أ�����ͻ��׳��쳣
				 *�������ṩ��remove������ɾ���ľ���ͨ��next����������Ԫ��
				 */
				it.remove();//����ʹ�õ����������remove����
			}
		}
		System.out.println(c);
	}
}
