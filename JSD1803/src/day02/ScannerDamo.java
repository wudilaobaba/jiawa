package day02;
import java.util.Scanner;

public class ScannerDamo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年龄");
		int a = scan.nextInt();
		System.out.println("请输入价格");
		double price = scan.nextDouble();
		System.out.println(a);
		System.out.println(price);
	}

}
