package string;
/**
 * 字符串支持正则表达式的方法之一
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符是否满足格式
 * @author Administrator
 *
 */
public class MatchDemo {
	/**
	 * 邮箱正则  \w+@\w+(\.\w+)+
	 * @param args
	 */
	public static void main(String[] args) {
		String email = "whj@qq.com";
		String regex = "\\w+@\\w+(\\.\\w+)+"; //.是在正则中是任意字符，此时.只的就是一个字符.
		//java中要是把正则表达式放在字符串中，那么在字符串中见到反斜杠就在前面多加一个反斜杠   java中可以不加边界符也是全匹配
		boolean a = email.matches(regex);
		System.out.println(a);
	}

}
