package string;
/**
 * 字符串支持正则表达式的方法之二
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分
 * 返回所有被拆分后的部分
 * @author Administrator
 *
 */
public class SplitDemo {

	public static void main(String[] args) {
		String str = "55a5asd545dsa44";//split方法中 末尾匹配上了就会忽略   开头匹配上了就会保留
		String[] s = str.split("\\d+");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}

}
