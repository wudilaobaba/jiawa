package oo.day06;

public class StaticFinalDemo {

	public static void main(String[] args) {
		Aoo o = new Aoo();
		System.out.println(o.xx);
		
		System.out.println(Boo.num);
//		1)����Boo.class��������
//		2)��̬����numҲ�����ڷ�������
//		3)���������л�ȡnum��ֵ�����
		
		
		System.out.println(Boo.COUNT); //Ч�ʸ�
//		1)�������ڱ���ʱ���Ὣ�����Զ��滻Ϊ�����ֵ
//		2)�൱��System.out.println(12);
	}

}

class Aoo{
	public static final int xx = 12;
}
class Boo{
	public static int num = 12;
	public static final int COUNT = 12;//����
}