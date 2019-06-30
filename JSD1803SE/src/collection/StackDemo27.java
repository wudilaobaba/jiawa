package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构 - 用来实现类似浏览器后退的功能
 * 栈可以保存一组元素，存取元素必须遵循先进后出原则
 * java.util.Deque支持栈操作，提供了对应的方法。
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
