package day03;
//�ж���ƽ�껹������
//��ʽ���ܱ�4�����Ҳ��ܱ�100���� || �ܱ�400����
import java.util.Scanner;
public class LeapYear {

	public static void 	main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������");
		int year = scan.nextInt();
		
		System.out.println((year%4==0&&year%100!=0)||year%400==0?"����":"ƽ��");
	}

}
