package oo.day01;
//学生类的测试类 要有主方法
public class StudentTest {

	public static void main(String[] args) {
		Student zs = new Student();
		zs.name = "张三";
		zs.age = 16;
		zs.address = "北京路150号";
		zs.sayHi();
		zs.study();
		System.out.println(zs.getMoney());
	}

}
