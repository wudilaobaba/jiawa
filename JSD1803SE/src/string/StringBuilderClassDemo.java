package string;
/**
 * StringBuilder��ר����������޸��ַ������ݵ�     StringBuffer����StringBuilder��һ��   StringBuffer(�̰߳�ȫ��)
 * �ڲ�ά��һ���ɱ���ַ����顣����С�����ܺ�
 * ���Է���Ƶ���޸��ַ������ݲ���ʱ����Ӧ��ʹ���������
 * @author Administrator
 *
 */
public class StringBuilderClassDemo {

	public static void main(String[] args) {
		//StringBuilder builder = new StringBuilder();//��������û���κ��ַ�--->""
		StringBuilder builder1 = new StringBuilder("��������");
		//�� append
		builder1.append("��˵ɶ��");//append��׷���ַ�    ֮ǰ���ַ���ʹ�üӺ����Ӿ��ǵײ������append����
		String str = builder1.toString();//StringBuilder����ҪtoString()���ܱ�Ϊ�ַ���
		System.out.println(str);
		
		//�� replace
		builder1.replace(5, 8, "xz");
		str = builder1.toString();
		System.out.println(str);
		
		//ɾ delete ɾ��ָ����Χ�ڵ��ַ���
		builder1.delete(3, 8);
		str = builder1.toString();
		System.out.println(str);
		
		//�� insert �����������ݲ��뵽ָ��λ����
		builder1.insert(1,"����");
		str = builder1.toString();
		System.out.println(str);
		
		
		
		StringBuilder builder2 = new StringBuilder("a");
		for(int i=0;i<10000000;i++){
			builder2.append("a");
		}
		System.out.println("����");
	}

}
