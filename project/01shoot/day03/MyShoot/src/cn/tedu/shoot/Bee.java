package cn.tedu.shoot;
import java.util.Random;
//С�۷����
public class Bee {
	int x;
	int y;
	int xSpeed;//x���ƶ��ٶ�
	int ySpeed;//y���ƶ��ٶ�
	int width;
	int height;
	int awardType;//��������
	/**
	 * С�۷���ƶ�
	 */
	Bee(){
		Random rand = new Random();
		width = 40;
		height = 60;
		x = rand.nextInt(400 - this.width);
		y = (int)(Math.random()*(-700+this.height - (0-this.height+1)) + (0-this.height+1));;
		System.out.println("С�۷��ʼ����--> (x:"+x+", y:"+y+")");
	}
	void step(){
		System.out.println("С�۷��ʼ����--> (x:"+x+", y:"+y+")");
	}
}
