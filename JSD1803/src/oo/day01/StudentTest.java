package oo.day01;
//ѧ����Ĳ����� Ҫ��������
public class StudentTest {

	public static void main(String[] args) {
		Student zs = new Student();
		zs.name = "����";
		zs.age = 16;
		zs.address = "����·150��";
		zs.sayHi();
		zs.study();
		System.out.println(zs.getMoney());
	}

}
