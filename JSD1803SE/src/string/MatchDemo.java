package string;
/**
 * �ַ���֧��������ʽ�ķ���֮һ
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ��Ƿ������ʽ
 * @author Administrator
 *
 */
public class MatchDemo {
	/**
	 * ��������  \w+@\w+(\.\w+)+
	 * @param args
	 */
	public static void main(String[] args) {
		String email = "whj@qq.com";
		String regex = "\\w+@\\w+(\\.\\w+)+"; //.�����������������ַ�����ʱ.ֻ�ľ���һ���ַ�.
		//java��Ҫ�ǰ�������ʽ�����ַ����У���ô���ַ����м�����б�ܾ���ǰ����һ����б��   java�п��Բ��ӱ߽��Ҳ��ȫƥ��
		boolean a = email.matches(regex);
		System.out.println(a);
	}

}
