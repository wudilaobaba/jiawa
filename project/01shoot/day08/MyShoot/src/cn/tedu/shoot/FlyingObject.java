package cn.tedu.shoot;
import java.util.Random;
//���з�����ĳ���
public class FlyingObject {
	int width;
	int height;
	int x;
	int y;
	//���µĹ��캯����ר�Ÿ���л���С�л���С�۷��ṩ��
	FlyingObject(int width, int height){
		Random rand = new Random();
		this.width = width;
		this.height = height;
		this.x = rand.nextInt(400-this.width);
		this.y = -this.height;
	}
	//���µĹ��캯����ר�Ÿ�Ӣ�ۻ����ӵ�������ṩ��...
	FlyingObject(int width, int height, int x, int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	void step(){
		System.out.println("�������ƶ���");
	}
}
