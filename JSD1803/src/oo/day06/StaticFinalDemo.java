package oo.day06;

public class StaticFinalDemo {

	public static void main(String[] args) {
		Aoo o = new Aoo();
		System.out.println(o.xx);
		
		System.out.println(Boo.num);
//		1)加载Boo.class到方法区
//		2)静态变量num也存在于方法区中
//		3)到方法区中获取num的值并输出
		
		
		System.out.println(Boo.COUNT); //效率高
//		1)编译器在编译时，会将常量自动替换为具体的值
//		2)相当于System.out.println(12);
	}

}

class Aoo{
	public static final int xx = 12;
}
class Boo{
	public static int num = 12;
	public static final int COUNT = 12;//常量
}