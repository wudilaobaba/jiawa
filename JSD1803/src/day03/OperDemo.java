package day03;
//运算符的演示
public class OperDemo {

	public static void main(String[] args) {
		//++单独使用时(一行中只有a++或++a)，在前在后无差别
		int a = 5 , b = 5;
		a++;
		++b;
		System.out.println(a);
		System.out.println(b);
		
		//++被使用时(一行之中除了a++或++a还有其他代码)：在前在后有差别
		int c = 5, d = 5;
		int e = c++;
		int f = ++d;
		System.out.println(e);
		System.out.println(f);
		
		//综合使用++
		int n = 5 , m = 5;
		System.out.println(n++);//5
		System.out.println(n);//6
		System.out.println(++m);//6
		System.out.println(m);//6
		
		
		//逻辑运算的短路++
		int g = 5, h = 10, k = 5;
		boolean b1 = g>h && k++>2;
		System.out.println(b1);
		System.out.println(k);
		
		//美杜莎
		System.out.println(""+10+20+30);
		
		//三目
		int aa = 100;
		int dd = aa>10?10:aa<2?2:aa==20?20:-1;
		System.out.println(dd);
		
		//取三个中的最大值
		int nn = 200, mm = 50, kk=3;
		int r = nn>mm?nn:mm>kk?mm:kk;
		System.out.println(r);
	}

}
