package oo.day05;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

final class Koo extends Noo{}
//class Too extends Koo{} ���˲��ܼ̳���
class Noo{}





class Yoo{
	final void show(){}
	void say(){}
}
class Goo extends Yoo{
	//void show(){} ����final��ô�޷�����д
	void say(){}
}




/*
 * final���γ�Ա����
 * 1) ����ʱ���븳ֵ
 * 2) ������ʱ����ֵ����Ҫ�ڹ��췽����ȥ��ֵ
 * final���ξֲ���������֮ǰ��ֵ����
 */

class Eoo{
	final int num = 5;
	final int x;
	Eoo(){
		x = 10;
	}
	void show(){
		final int b;
	}
}