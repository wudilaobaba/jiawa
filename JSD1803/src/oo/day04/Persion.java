package oo.day04;

public class Persion {
	String name;
	int age;
	String address;
	Persion(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void sayHi(){
		System.out.println("��Һã��ҽ�"+name+",����"+age+"���ˣ���ס"+address);
	}
}
