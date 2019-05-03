package binary.day01;

public class Demo02 {

	public static void main(String[] args) {
		int a = 0x93;//int后面的变量的表现永远都是10进制的
		int b = 0x00000001;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
	}

}
