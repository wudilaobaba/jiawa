package oo.day03;
//����super�����
public class SuperDemo {
	public static void main(String[] args) {
		Boo b = new Boo();

	}
}

class Aoo{
	Aoo(int a){
		System.out.println("���๹�췽��"+a);
	}
	Aoo(){
		System.out.println("���๹�췽��");
	}
}

class Boo extends Aoo{
	Boo(){
		//super(12);//������Ĺ��캯�����в�������ô����������������Ĺ��캯���ͻᱨ��
		//ֻ���������ó�����޲ι��캯��
		System.out.println("�����๹�췽��");
	}
}