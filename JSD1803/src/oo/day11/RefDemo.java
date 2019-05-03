package oo.day11;
//引用类型划等号
public class RefDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = s1;
		s1.age = 28;
		s2.age = 25;
		System.out.println(s1.age); //25
		
		int a = 5;
		int b = a;
		a = 8;
		b = 88;
		System.out.println(a);
	}

}

class Student{
	String name;
	int age;
}