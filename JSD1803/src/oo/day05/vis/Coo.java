package oo.day05.vis;
import oo.day05.Aoo;
public class Coo {//��ʾͬ���ĸ���
	void show(){
		Aoo o = new Aoo();
		o.a = 1;
		//o.b = 1;//�������
		//o.c = 1;//�������
		//o.d = 1;//�������
	}
}

class Doo extends Aoo{ //��ʾprotected
	void show(){
		super.a = 1;
		super.b = 1;
		//super.c = 1; //c��Ĭ�ϵĳ�Ա������ֻ���ڱ����л�ͬ�����з���
		//super.d = 1;
	}
}

