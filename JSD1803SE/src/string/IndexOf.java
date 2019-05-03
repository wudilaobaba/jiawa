package string;
/**
 * int indexOf(String str)
 * 查看给定字符串在当前字符串中的位置，若当前字符串不含有该内容则返回值为-1
 * @author Administrator
 *
 */
public class IndexOf {

	public static void main(String[] args) {
		String str = "sdddddd111a1xa1ya1ua1z";
		int index = str.indexOf("a1");
		System.out.println(index);
		
		//从指定位置开始查找
		index = str.indexOf("a1",11);
		System.out.println(index);
		
		//查找最后一次出现给定字符串的位置
		index = str.lastIndexOf("a1");
		System.out.println(index);
	}

}
