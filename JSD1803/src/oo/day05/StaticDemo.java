package oo.day05;
//static����ʾ
public class StaticDemo {

	public static void main(String[] args) {
		Loo o1 = new Loo();
		o1.show();
		Loo o2 = new Loo();
		o2.show();
		Loo o3 = new Loo();
		o3.show();
		System.out.println(Loo.b);//���ʾ�̬���� //���飡����
		System.out.println(o1.b);//���ʾ�̬����  //�ǳ������飡����
		
		Xoo o4 = new Xoo();
		Xoo o5 = new Xoo();
	}

}

class Moo{//��ʾ��̬����
	int a;
	static int b;
	void show(){//ʵ������  ��this
		System.out.println(a);
		System.out.println(b);
	}
	static void test(){//��̬����  ûthis
		//System.out.println(a);//a��ʵ������,������ʵ��ȥʹ�ã����Ǿ�̬������û��this,���Ա������
		System.out.println(b);
	}
}

class Loo{//��ʾ��̬����
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show(){
		System.out.println("a="+a+";"+"b="+b);
	}
}


class Xoo{//��ʾ��̬��
	static {
		System.out.println("��̬��");
	}
	Xoo(){
		System.out.println("���췽��");
	}
}