package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 队列(左进右出)--双端队列(左右皆可进出)--栈(左进左出)
 *    队列Queuq:offer、poll
 * 双端队列Deque:offerFirst、offerLast、pollFirst、pollLast、peekFirst、peekLast
 *    但栈Deque:push、pop
 * java.util.Deque 双端队列 first<--->last
 * Deque接口继承自Queue,双端队列是两端都可以做进出队操作的队列
 * 常用实现类：java.util.LinkedList
 * 栈：先进后出，只有一个出入口(若作为一个栈的话，就仅仅使用push和pop就足够了)
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
		
		//引用队首元素,不做出队操作
		str = d.peekFirst();
		str = d.peekLast();
		System.out.println(str);
		System.out.println(d);
	}
}
