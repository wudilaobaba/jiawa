package binary.day01;

public class Demo06 {

	public static void main(String[] args) {
		//n:0000 0100 1001 0001 0011 1111 0101 0101
		//     0    4    9    1    3    f    5    5 
		int n = 0x4913f55;
		int m = n<<1;
		//m: 0000 1001 0010 0010 0111 1110 1010 1010
		int k = n<<2;
		int j = n<<8;
		System.out.println("n: "+Integer.toBinaryString(n));
		System.out.println("m: "+Integer.toBinaryString(m));
		System.out.println("k: "+Integer.toBinaryString(k));
		System.out.println("j: "+Integer.toBinaryString(j));
	}

}
