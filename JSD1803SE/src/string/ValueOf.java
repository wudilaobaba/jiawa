package string;
/**
 * String�ṩ��һ�����صľ�̬������valueOf
 * �����ǽ�java����������ת��Ϊ�ַ���
 * �������ǽ���������ת��Ϊ�ַ���
 * @author Administrator
 *
 */
public class ValueOf {

	public static void main(String[] args) {
		int d = 100;
		String str = String.valueOf(d);
		System.out.println(str);
		
		
		//�ַ���ƴ�ӵ���������
		String strs = "a";
		for(int i=0;i<10000000;i++){
			strs+="a"; //ÿһ��ƴ�Ӷ��Ǵ���һ���¶���  �ַ������ʺ�Ƶ�����޸�  ������Ƶ���޸��ַ�������StringBuilder��
		}
		System.out.println("������");
	}

}
