package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * �жϵ�ǰ�ַ����Ƿ��Ը����ַ�����ʼ�����
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
