package string;
/**
 * StringBuilder是专门设计用来修改字符串内容的     StringBuffer类与StringBuilder类一样   StringBuffer(线程安全的)
 * 内部维护一个可变的字符数组。开销小，性能好
 * 所以凡是频繁修改字符串内容操作时，都应当使用它来完成
 * @author Administrator
 *
 */
public class StringBuilderClassDemo {

	public static void main(String[] args) {
		//StringBuilder builder = new StringBuilder();//现在里面没有任何字符--->""
		StringBuilder builder1 = new StringBuilder("撒大声地");
		//增 append
		builder1.append("，说啥呢");//append是追加字符    之前的字符串使用加号连接就是底层调用了append方法
		String str = builder1.toString();//StringBuilder对象要toString()才能变为字符串
		System.out.println(str);
		
		//改 replace
		builder1.replace(5, 8, "xz");
		str = builder1.toString();
		System.out.println(str);
		
		//删 delete 删除指定范围内的字符串
		builder1.delete(3, 8);
		str = builder1.toString();
		System.out.println(str);
		
		//插 insert 将给定的内容插入到指定位置上
		builder1.insert(1,"活着");
		str = builder1.toString();
		System.out.println(str);
		
		
		
		StringBuilder builder2 = new StringBuilder("a");
		for(int i=0;i<10000000;i++){
			builder2.append("a");
		}
		System.out.println("完事");
	}

}
