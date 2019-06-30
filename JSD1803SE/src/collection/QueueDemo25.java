package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ����  β��ͷ��(��ͷ��β) first<---last
 * ���п��Դ��һ��Ԫ�أ����Ǵ�ȡ���밴���Ƚ��ȳ�ԭ��
 * Queue��һ���ӿڣ���̳���Collection�����Զ���Ҳ���м��ϵ����ԡ�add,size�ȷ�����Ȼ���á�
 * QueueҲ�ṩ��һ������ӵķ���������ʵ����Ϊ��java.util.LinkedList
 * @author Administrator
 *
 */
public class QueueDemo25 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList();
		//��Ӳ���
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		//���Ӳ���
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		//���ö���Ԫ��,�������Ӳ���
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/**
		 * �������п���ʹ�õ�����(��ѭ��)
		 * ��������Ӱ������е�Ԫ��
		 */
		for(String s : queue){
			System.out.println(s);
		}
		System.out.println(queue);
	}
}
