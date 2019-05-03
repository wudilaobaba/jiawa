package string;
/**
 * 字符串支持正则表达式的方法之三
 * String replaceAll(String regex, String str)
 * 当前字符串中满足正则表达式的部分替换为给定的字符串
 * @author Administrator
 *
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str = "abc123def456ghi";
		String str1 = "abc123def456ghi";
		//将数字部分替换为#NUMBER#
		//替换后abc#NUMBER#def#NUMBER#ghi
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
		
		str1 = str1.replaceAll("[a-z]+", "#CHAR#");
		System.out.println(str1);
	}

}
