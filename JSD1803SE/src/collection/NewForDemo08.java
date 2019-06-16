package collection;
/**
 * 新循环 自JDK1.5之后推出的一个特性
 * 新循环是用来遍历集合或数组使用的
 * 新循环又称为：增强for循环，for each
 * @author Administrator
 *
 */
public class NewForDemo08 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five"};
		/*
		 * 新循环是编译器认可，而不是JVM认可，编译器会将新循环遍历数组改为普通for循环遍历
		 */
		for(String str : array){
			System.out.println(str);
		}
	}
}
