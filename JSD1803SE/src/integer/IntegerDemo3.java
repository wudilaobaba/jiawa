package integer;
/**
 * ��װ��֧��һ����̬������parseXXX(String str)
 * ���Խ��������ַ�������Ϊ��Ӧ�Ļ������ͣ�
 * ����ǰ���Ǹ��ַ������ݱ�����ȷ��ʾ�������Ϳ��Ա����ֵ
 * @author Administrator
 *
 */
public class IntegerDemo3 {

	public static void main(String[] args) {
		String str = "123";//"123.13"����parseInt�Ĳ�������Ϊ�����������ַ���
		int d = Integer.parseInt(str);
		System.out.println(d);
		
		String s = "123.123";
		double dou = Double.parseDouble(s);
		System.out.println(dou+1);
	}

}
