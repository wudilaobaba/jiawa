package day03;
//判断是平年还是闰年
//公式：能被4整除且不能被100整除 || 能被400整除
import java.util.Scanner;
public class LeapYear {

	public static void 	main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scan.nextInt();
		
		System.out.println((year%4==0&&year%100!=0)||year%400==0?"闰年":"平年");
	}

}
