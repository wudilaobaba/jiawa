package day03;
//输入单价、数量、付款金额、应收金额、找零
import java.util.Scanner;
public class Casher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入单价");
		double price = scan.nextDouble();
		System.out.println("请输入数量");
		int total = scan.nextInt();
		System.out.println("请输入付款钱数");
		double money = scan.nextDouble();
		//满500打8折 && 满499减100
		double allPrice = price*total>=500?
							price*total*0.8:
							price*total==499?
								price*total-100:
								price*total;
		System.out.println(allPrice);
		if(money-allPrice<0){
			System.out.println("总价"+allPrice+"，你还应付："+ (-(money-allPrice)));
		}else{
			System.out.println("总价"+allPrice+"，找零："+(money-allPrice));
		}
	}

}
