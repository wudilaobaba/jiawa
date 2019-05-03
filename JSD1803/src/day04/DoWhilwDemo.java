package day04;
import java.util.Scanner;
public class DoWhilwDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//生成一个200~210之间的随机整数
		int i = (int)(Math.random()*(200 - (210+1)) + (210+1));
		System.out.println("请输入一个数字");
		int num;
		
		do{
			num = scan.nextInt();
			if(num==0){
				break;//while中写break,那么while中break下面的语句就不执行了
			}
			if(num>i){
				System.out.println("大了");
			}else if(num<i){
				System.out.println("小了");
			}
		}while(num != i);
		
		
		if(num==0){
			System.out.println("bye");
		}else{
			System.out.println("猜对了");
		}

	}

}
