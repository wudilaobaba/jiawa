package oo.day04;

public class Teacher extends Persion{
	double salary;
	Teacher(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary = salary;
	}
	void sayHi(){
		System.out.println("��Һã��ҽ�"+name+",����"+age+"���ˣ���ס"+address+"�������ǣ�"+salary);
	}
}
