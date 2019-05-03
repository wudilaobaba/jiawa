package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否以给定字符串开始或结束
 * @author Administrator
 *
 */
public class StartsWithEndsWith {

	public static void main(String[] args) {
		String str = "thinging in java";
		
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		
		boolean ends = str.endsWith("a");
		System.out.println(ends);
	}

}
