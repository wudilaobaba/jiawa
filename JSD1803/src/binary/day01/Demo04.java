package binary.day01;

public class Demo04 {

	public static void main(String[] args) {
		int n = 6;
		int m = ~n; //��6�Ķ�����ȡ���󷵻�ʮ���Ƶ���
		System.out.println(m+1);
		System.out.println("�������------------");
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(m+1));
		
		int p = -59;
		System.out.println(Integer.toBinaryString(p));
	}

}
