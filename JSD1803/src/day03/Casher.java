package day03;
//���뵥�ۡ������������Ӧ�ս�����
import java.util.Scanner;
public class Casher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����뵥��");
		double price = scan.nextDouble();
		System.out.println("����������");
		int total = scan.nextInt();
		System.out.println("�����븶��Ǯ��");
		double money = scan.nextDouble();
		//��500��8�� && ��499��100
		double allPrice = price*total>=500?
							price*total*0.8:
							price*total==499?
								price*total-100:
								price*total;
		System.out.println(allPrice);
		if(money-allPrice<0){
			System.out.println("�ܼ�"+allPrice+"���㻹Ӧ����"+ (-(money-allPrice)));
		}else{
			System.out.println("�ܼ�"+allPrice+"�����㣺"+(money-allPrice));
		}
	}

}
