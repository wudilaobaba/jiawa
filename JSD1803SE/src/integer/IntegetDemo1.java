package integer;

public class IntegetDemo1 {
	/**
	 * ���ڻ������Ͳ���ֱ�Ӳ����������Ŀ���������java�ṩ��8��������������Ӧ�İ�װ�࣬
	 * �Ӷ����Խ���������ת��Ϊ�����󡱣������Ϳ��Բ�����������ģʽ���п�����
	 * 6���������͵İ�װ��̳���java.lang.Number
	 * Number��һ�������࣬�����˿�������������֮����л�ת�ķ���
	 */
	public static void main(String[] args) {
		//�����ֱ�ɰ�װ��
		int d = 1;
		int a = 127;
//		Integer i1 = new Integer(d);
//		Integer i2 = new Integer(d);
		Integer i1 = Integer.valueOf(d); //long��intֻ����һ�ֽ����ڵ�����127  ��������ת��װ�� �Ƽ�
		Integer i2 = Integer.valueOf(d);
		Long i3 = Long.valueOf(a);          //Double.valueOf();���Ỻ��
		Long i4 = Long.valueOf(a);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		//��װ��תΪ��������
		int in = i1.intValue();
		double o = i1.doubleValue();
		System.out.println(o);
		byte b = i1.byteValue();
		System.out.println(b);
	}

}

