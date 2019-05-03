package string;
/**
 * 字符串
 * @author Administrator
 *
 */
public class StringDemo {
	public static void main(String[] args){
		String str1 = "111";
		String str2 = "111";
		System.out.println(str2==str1);//内容一样的字符串，java不会创建两次
		
		str1=str1+"~";//str1改了以后，就指向了新的地址
		System.out.println(str2);
		
		String str3 = new String("111");
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));//==用来判断地址  	equals用来判断内容
		
		
		/**
		 * 编译器的优化措施
		 * 当一个计算表达式计算符号两边都是字面量时，编译器会将结果计算出来并替换原来的表达式，所以JVM在运行class文件时，、
		 * 看到下面代码被编译器改为了"111",所以会重用str2对象
		 */
		String str4 = "1"+"11"; //编译器直接编译为111
		System.out.println(str2==str4);
		
		String s = "1";
		String str5 = s+"11"; //若是变量的话就会创建一个新的s对象
		System.out.println(s==str5);
	}
}
