package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ����(����ҳ�)--˫�˶���(���ҽԿɽ���)--ջ(������)
 *    ����Queuq:offer��poll
 * ˫�˶���Deque:offerFirst��offerLast��pollFirst��pollLast��peekFirst��peekLast
 *    ��ջDeque:push��pop
 * java.util.Deque ˫�˶��� first<--->last
 * Deque�ӿڼ̳���Queue,˫�˶��������˶������������Ӳ����Ķ���
 * ����ʵ���ࣺjava.util.LinkedList
 * ջ���Ƚ������ֻ��һ�������(����Ϊһ��ջ�Ļ����ͽ���ʹ��push��pop���㹻��)
 * @author Administrator
 *
 */
public class DequeDemo26 {
	public static void main(String[] args) {
		Deque<String> d = new LinkedList<String>();
		d.offer("1");
		d.offer("2");
		d.offerFirst("3");
		d.offerLast("4");
		String str = d.poll();
		str = d.pollLast();
		str = d.pollFirst();
		
		//���ö���Ԫ��,�������Ӳ���
		str = d.peekFirst();
		str = d.peekLast();
		System.out.println(str);
		System.out.println(d);
	}
}
