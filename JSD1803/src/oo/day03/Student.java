package oo.day03;

public class Student {
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	Student(String name){
		this.name = name;
		this.age = 100;
	}
	void study(){
		System.out.println(name+"今年"+age+"岁，在学习");
	}
}
