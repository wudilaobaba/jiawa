package string;
/**
 * �ַ���֧��������ʽ�ķ���֮��
 * String[] split(String regex)
 * ����ǰ�ַ�����������������ʽ�Ĳ��ֽ��в��
 * �������б���ֺ�Ĳ���
 * @author Administrator
 *
 */
public class SplitDemo {

	public static void main(String[] args) {
		String str = "55a5asd545dsa44";//split������ ĩβƥ�����˾ͻ����   ��ͷƥ�����˾ͻᱣ��
		String[] s = str.split("\\d+");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}

}
