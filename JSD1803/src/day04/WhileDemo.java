package day04;
//while����ʾ
import java.util.Scanner;
public class WhileDemo {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������");
		int num = scan.nextInt();
		//����һ��200~210֮����������
		int i = (int)(Math.random()*(200 - (210+1)) + (210+1));
		while(num != i){
			if(num==0){
				break;//while��дbreak,��ôwhile��break��������Ͳ�ִ����
			}
			if(num>i && num!=0){
				System.out.println("����");
			}else{
				System.out.println("С��");
			}
			num = scan.nextInt();//����һ����nextInt�ͻ�ͣס�����û�����
		}
		if(num==0){
			System.out.println("bye");
		}else{
			System.out.println("�¶���");
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
