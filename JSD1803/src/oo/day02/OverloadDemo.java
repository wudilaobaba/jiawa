package oo.day02;
/**
 * һ���ļ��п��԰��������(���ǲ�����  ����һ���ļ���ֻ����һ��class)
 * һ���ļ������ֻ�ܰ���һ��public��   (�����ࡢ�����뷽�����ǲ��е�)
 * public���ε�������뵱ǰ�ļ�����ͬ
 */

public class OverloadDemo {
	public static void main(String[] args) {
		//����
		Aoo a = new Aoo();
		a.say(25);
		
		//����
		Boo b = new Boo("����",45);
		System.out.println(b.name);
		System.out.println(b.age);
		Coo c = new Coo(10);//���캯���вα��봫�Σ�������������
	
		//this
		Doo d = new Doo("��Ա��",26);
		d.address = "��������";
		d.study();
	}

}
//������������ʾ
class Aoo{
	void say(){}
	void say(String name){}
	void say(int age){}
	void say(String name,int age){}
	void say(int age,String name){}
	//int say(){return 1} //������� �����뷵��ֵ�޹�
	//void say(String address){} //������� ������������޹�
}

//���췽��
class Boo{
	String name;
	int age;
	Boo(String name,int age){
		this.age = age;
		System.out.println(name+age);
	}
}
class Coo{
	String name;
	int age;
	Coo(int a){
		
	}
}

//this
class Doo{
	String name;
	int age;
	String address;
	Doo(String name,int age){
		//��Ա������ֲ���������������ʹ�õ�ʱ����þͽ�ԭ�������name/ageȫ�Ǿͽ��ľֲ�������û������;�������Ա������this.
		//name = name;
		//age = age;
		this.name = name;
		this.age = age;
	}
	void study(){
		System.out.println(name+"��--"+address+" ѧϰ");//�����nameֻ��ʹ�ó�Ա������name,�ò��˾ֲ�����name,���Կ���ʡȥthis.
		//�൱��:
		//System.out.println(this.name+"��ѧϰ");
	}
}
//this��ʹ��ԭ�򣬱������Ա����ͬ������ô��Ҫ��this;��Ա�����������������������Ļ��Ͳ���дthis.
