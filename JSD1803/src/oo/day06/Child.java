package oo.day06;

public class Child extends Father{
	//private static int test = 11; 
	public static void main(String[] args) {
		test++;
		System.out.println(test);
		System.out.println(Father.test);
	}
}

//结论：在子类没有重定义超类的静态属性时，超类的静态属性与子类是共享的；
//去掉上面注释，则说明子类重定义了超类的静态属性，则二者的test不再共享