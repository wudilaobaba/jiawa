package integer;
/**
 * 包装类支持一个静态方法：parseXXX(String str)
 * 可以将给定的字符串解析为对应的基本类型，
 * 但是前提是该字符串内容必须正确表示基本类型可以保存的值
 * @author Administrator
 *
 */
public class IntegerDemo3 {

	public static void main(String[] args) {
		String str = "123";//"123.13"报错，parseInt的参数必须为类似整数的字符串
		int d = Integer.parseInt(str);
		System.out.println(d);
		
		String s = "123.123";
		double dou = Double.parseDouble(s);
		System.out.println(dou+1);
	}

}
