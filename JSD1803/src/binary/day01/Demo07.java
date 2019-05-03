package binary.day01;

public class Demo07 {

	public static void main(String[] args) {
		int n = 50;
		//n:00000000 00000000 00000000 00110010
		int m = n<<1;
		//m:00000000 00000000 00000000 01100100
		System.out.println(m);
		
		
		int a = 1;
		for(int i=0;i<32;i++){
			//System.out.println(a<<i);//最后一位是最小值
			System.out.println(Integer.toBinaryString(a<<i));
		}
	}

}
