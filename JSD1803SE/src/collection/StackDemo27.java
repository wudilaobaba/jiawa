package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ�ṹ - ����ʵ��������������˵Ĺ���
 * ջ���Ա���һ��Ԫ�أ���ȡԪ�ر�����ѭ�Ƚ����ԭ��
 * java.util.Deque֧��ջ�������ṩ�˶�Ӧ�ķ�����
 * @author Administrator
 *
 */
public class StackDemo27 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		System.out.println(stack);
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
	}
}
