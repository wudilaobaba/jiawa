package oo.day05;

public class Aoo {
	public int a;    //�κ�����
	protected int b; //�����С������С�ͬ������
	int c;           //�����С�ͬ������
	private int d;   //������
	
	void show(){
		a = 1;
		b = 2;
		c = 3;
		d = 4;
	}
}

class Boo{ //��ʾprivate
	void show(){
		Aoo o = new Aoo();
		o.a = 1;
		o.b = 2;
		o.c = 3;
		//o.d = 4; //����
	}
}

class Foo extends Aoo{
	void show(){
		c = 100;
	}
}
