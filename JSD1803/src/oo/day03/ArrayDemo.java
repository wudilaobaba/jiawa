package oo.day03;
//引用类型的数组
public class ArrayDemo {

	public static void main(String[] args) {
		Student[] s = new Student[]{
			new Student("张华",15),
			new Student("汰换",12),
			new Student("武陵")
		};
		s[0].study();
		s[1].study();
		s[2].study();
		
		s[1] =new Student("武陵"); 
		s[1] =new Student("武陵111");//s[1]地址的指向发生变化
		System.out.println(s[1].name);
		
		int[][] arr = new int[3][4];
		arr[1][0] = 12;
		
		
		//引用类型为null时的空指针异常现象：
		Student zc = new Student("张三",12);
		zc = null;
		//System.out.println(zc.name); //该句报错，空指针异常
		
	}

}
