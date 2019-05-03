package string;
/**
 * String提供了一组重载的静态方法：valueOf
 * 作用是将java中其他类型转换为字符串
 * 常见的是将基本类型转换为字符串
 * @author Administrator
 *
 */
public class ValueOf {

	public static void main(String[] args) {
		int d = 100;
		String str = String.valueOf(d);
		System.out.println(str);
		
		
		//字符串拼接的性能问题
		String strs = "a";
		for(int i=0;i<10000000;i++){
			strs+="a"; //每一次拼接都是创建一个新对象  字符串不适合频繁的修改  将来想频繁修改字符串就用StringBuilder类
		}
		System.out.println("完事了");
	}

}
