package binary.day01;

public class Demo04 {

	public static void main(String[] args) {
		int n = 6;
		int m = ~n; //将6的二进制取反后返回十进制的数
		System.out.println(m+1);
		System.out.println("计算过程------------");
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(m+1));
		
		int p = -59;
		System.out.println(Integer.toBinaryString(p));
	}

}
