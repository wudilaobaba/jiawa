package oo.day04_1;
//��������
public class UploadDemo {

	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.a = 1;
		//o1.b = 2; //�������  ���಻���Է���������
		
		Boo o2 = new Boo();
		o2.b = 1;
		o2.test();
		o2.a = 2; //��������Է��ʳ����
		o2.show();
		
		//Boo o3 = new Aoo();//�������
		
		Aoo o4 = new Boo(); //��������
		o4.a = 1;
		o4.show();
		//o4.b = 1; //�������  �ܵ����ʲôҪ��������ʲô
		//o4.test();//�������  �ܵ����ʲôҪ��������ʲô
	}

}

class Aoo{
	int a;
	void show(){
		
	}
}

class Boo extends Aoo{
	int b;
	void test(){
		
	}
}