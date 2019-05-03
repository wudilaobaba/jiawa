package oo.day04;

public class Student extends Persion{
	String stuId;
	Student(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId = stuId;
	}
	void sayHi(){
		System.out.println("大家好，我叫"+name+",今年"+age+"岁了，家住"+address+"，学号是："+stuId);
	}
}
