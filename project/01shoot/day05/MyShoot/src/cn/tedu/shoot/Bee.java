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
		super(60,50);
		Random rand = new Random();
		xSpeed = 1;
		ySpeed = 2;
		awardType = rand.nextInt(2);//0��1
		System.out.println("С�۷��ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
}
