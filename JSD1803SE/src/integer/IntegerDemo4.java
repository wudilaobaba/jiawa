package integer;
/**
 * JDK1.5֮���Ƴ���һ�����ԣ��Զ���װ��
 * �������Ǳ������Ͽɣ�����JVM�Ͽɡ��������ڱ���Դ����ʱ���Զ���ȫ�����������װ����֮���ת��
 * ��������໥ת���������Ӷ��������ڱ�дԴ����ʱʵ���˻����������װ����֮���໥��ֵ�Ĳ���
 * 
 * @author Administrator
 *
 */
public class IntegerDemo4 {

	public static void main(String[] args) {
		/**
		 * �����˱������Զ���װ������
		 * ���������Զ���ȫ������ɰ�װ��ת��Ϊ�������͵Ĳ��������������class�ļ��лᱻ��Ϊ��
		 * int d = new Integer(1).getValue(); 
		 */
		int a = new Integer(1);//����
		System.out.println(a);
		
		/**
		 * �����˱������Զ���װ������
		 * ���������Զ���ȫ������ɰ�װ��ת��Ϊ�������͵Ĳ��������������class�ļ��лᱻ��Ϊ��
		 * Integer in = Integer.valueOf(1); 
		 */
		Integer in = 1;
		System.out.println(in);
	}

}
