package string;
/**
 * int indexOf(String str)
 * �鿴�����ַ����ڵ�ǰ�ַ����е�λ�ã�����ǰ�ַ��������и������򷵻�ֵΪ-1
 * @author Administrator
 *
 */
public class IndexOf {

	public static void main(String[] args) {
		String str = "sdddddd111a1xa1ya1ua1z";
		int index = str.indexOf("a1");
		System.out.println(index);
		
		//��ָ��λ�ÿ�ʼ����
		index = str.indexOf("a1",11);
		System.out.println(index);
		
		//�������һ�γ��ָ����ַ�����λ��
		index = str.lastIndexOf("a1");
		System.out.println(index);
	}

}
