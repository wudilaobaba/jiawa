package binary.day01;

public class Demo03 {

	public static void main(String[] args) {
		int n = -2;
		int m = n + 5 - 6;
		long y = -1L;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		long maxl = Long.MAX_VALUE;
		int a = 0x80000000; //int类型最小值的16进制写法
		int b = 0x7fffffff; //int类型最大值的16进制写法
		System.out.println(n);
		System.out.println(m);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Long.toBinaryString(y));
		System.out.println(Integer.toBinaryString(max)+"=========="+max);
		System.out.println(Long.toBinaryString(maxl)+"=========="+maxl);
		System.out.println(Integer.toBinaryString(min)+"=========="+min);
		System.out.println(a+" "+(a==min));
		System.out.println(b+" "+(b==max));
		int p = 0xffffffff;
		byte o = (byte)0xff;
		System.out.println(p);
		System.out.println(o);
	}
}
