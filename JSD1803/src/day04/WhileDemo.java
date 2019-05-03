package day04;
//while的演示
import java.util.Scanner;
public class WhileDemo {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int num = scan.nextInt();
		//生成一个200~210之间的随机整数
		int i = (int)(Math.random()*(200 - (210+1)) + (210+1));
		while(num != i){
			if(num==0){
				break;//while中写break,那么while中break下面的语句就不执行了
			}
			if(num>i && num!=0){
				System.out.println("大了");
			}else{
				System.out.println("小了");
			}
			num = scan.nextInt();//程序一看见nextInt就会停住等着用户输入
		}
		if(num==0){
			System.out.println("bye");
		}else{
			System.out.println("猜对了");
		}
		
		
		
		/*
		int a = 10;
		while(a>=1){
			System.out.println(a);
			a--;
		}
		*/
	}

}
