package cn.tedu.shoot;
import java.util.Random;
//С�۷����
public class Bee extends FlyingObject{
	int xSpeed;//x���ƶ��ٶ�
	int ySpeed;//y���ƶ��ٶ�
	int awardType;//��������
	/**
	 * С�۷���ƶ�
	 */
	Bee(){
		Random rand = new Random();
		width = 60;
		height = 50;
		x = rand.nextInt(400 - this.width);
		y = -this.height;
		xSpeed = 1;
		ySpeed = 2;
		awardType = rand.nextInt(2);//0��1
		System.out.println("С�۷��ʼ����--> (x:"+x+", y:"+y+")");
	}
}
