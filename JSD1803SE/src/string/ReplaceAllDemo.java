package string;
/**
 * �ַ���֧��������ʽ�ķ���֮��
 * String replaceAll(String regex, String str)
 * ��ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���
 * @author Administrator
 *
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str = "abc123def456ghi";
		String str1 = "abc123def456ghi";
		//�����ֲ����滻Ϊ#NUMBER#
		//�滻��abc#NUMBER#def#NUMBER#ghi
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
		
		str1 = str1.replaceAll("[a-z]+", "#CHAR#");
		System.out.println(str1);
	}

}
