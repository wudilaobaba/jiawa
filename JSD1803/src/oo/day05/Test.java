package oo.day05;

public class Test {
	int a = 10;
	static int b = 100;
	public static void main(String[] args) {
		b = 1;
		//a = 1;  静态方法中不能访问实例变量a，实在想访问，看下面:
		Test x = new Test();
		x.a = 1;
	}
}
