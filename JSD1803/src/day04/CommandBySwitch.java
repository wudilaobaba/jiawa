package day04;
import java.util.Scanner;
public class CommandBySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入月份计算天数，不考虑2月");
		int command = scan.nextInt();
		switch(command){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30天");
				break;
			case 2:
				System.out.println("28/29天");
		}
		
	}

}
