package string;
/**
 * �ַ���
 * @author Administrator
 *
 */
public class StringDemo {
	public static void main(String[] args){
		String str1 = "111";
		String str2 = "111";
		System.out.println(str2==str1);//����һ�����ַ�����java���ᴴ������
		
		str1=str1+"~";//str1�����Ժ󣬾�ָ�����µĵ�ַ
		System.out.println(str2);
		
		String str3 = new String("111");
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));//==�����жϵ�ַ  	equals�����ж�����
		
		
		/**
		 * ���������Ż���ʩ
		 * ��һ��������ʽ����������߶���������ʱ���������Ὣ�������������滻ԭ���ı��ʽ������JVM������class�ļ�ʱ����
		 * ����������뱻��������Ϊ��"111",���Ի�����str2����
		 */
		String str4 = "1"+"11"; //������ֱ�ӱ���Ϊ111
		System.out.println(str2==str4);
		
		String s = "1";
		String str5 = s+"11"; //���Ǳ����Ļ��ͻᴴ��һ���µ�s����
		System.out.println(s==str5);
	}
}
