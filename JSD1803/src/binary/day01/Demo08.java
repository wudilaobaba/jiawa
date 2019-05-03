package binary.day01;

public class Demo08 {

	public static void main(String[] args) {
		int n = -50;
		//n: 11111111 11111111 11111111 11001110
		int m = n>>1;
		//m: 11111111 11111111 11111111 11100111     -25
		int k = n>>2;
		//k: 11111111 11111111 11111111 11110011     -13
		System.out.println(k+"  "+Integer.toBinaryString(k));
		
		
		int a = 50;
		//a: 00000000 00000000 00000000 00110010
		int b = a>>1;
		//b: 00000000 00000000 00000000 00011001    25
		int c = a>>2;
		//c: 00000000 00000000 00000000 00001100    12
		
		int p = -1;
		//p: 11111111 11111111 11111111 11111111
		int y = p>>1;
		//y: 11111111 11111111 11111111 11111111
		System.out.println(y+" "+Integer.toBinaryString(y));
	}

}
