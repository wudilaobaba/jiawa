package oo.day04_1;
//��д�����ص�����
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();
		Eoo o = new Foo();
		goo.test(o);
	}

}

class Goo{
	void test(Eoo o){
		System.out.println("�����͵Ĳ���");
		o.show();
	}
	void test(Foo o){
		System.out.println("�������͵Ĳ���");
		o.show();
	}
}



class Eoo{
	void show(){
		System.out.println("����show");
	}
}

class Foo extends Eoo{
	void show(){
		System.out.println("������show");
	}
}