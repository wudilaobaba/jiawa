package day04;
import java.util.Scanner;
public class DoWhilwDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//����һ��200~210֮����������
		int i = (int)(Math.random()*(200 - (210+1)) + (210+1));
		System.out.println("������һ������");
		int num;
		
		do{
			num = scan.nextInt();
			if(num==0){
				break;//while��дbreak,��ôwhile��break��������Ͳ�ִ����
			}
			if(num>i){
				System.out.println("����");
			}else if(num<i){
				System.out.println("С��");
			}
		}while(num != i);
		
		
		if(num==0){
			System.out.println("bye");
		}else{
			System.out.println("�¶���");
		}

	}

}
