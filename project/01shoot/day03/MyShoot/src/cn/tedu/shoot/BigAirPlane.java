package cn.tedu.shoot;
import java.util.Random;
public class BigAirPlane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	BigAirPlane(){
		Random rand = new Random();
		width = 69;
		height = 99;
		x = rand.nextInt(400-this.width);
		y = (int)(Math.random()*(-700+this.height-(0-this.height+1))+(0-this.height+1));
		speed = 2;
		System.out.println("��л���ʼ����--> (x:"+x+", y:"+y+")");
	}
	/**
	 * ��л����ƶ�(yֵ�仯)
	 */
	void step(){
		System.out.println("��л���y�ƶ���"+speed);
	}
}
