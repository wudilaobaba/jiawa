package oo.day05;

public class Test {
	int a = 10;
	static int b = 100;
	public static void main(String[] args) {
		b = 1;
		//a = 1;  ��̬�����в��ܷ���ʵ������a��ʵ������ʣ�������:
		Test x = new Test();
		x.a = 1;
	}
}
