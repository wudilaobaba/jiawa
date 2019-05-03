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
		System.out.println("大家好，我叫"+name+",今年"+age+"岁了，家住"+address);
	}
}
