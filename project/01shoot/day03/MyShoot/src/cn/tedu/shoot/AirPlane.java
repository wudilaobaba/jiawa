package cn.tedu.shoot;
import java.util.Random;
//С�л�����
public class AirPlane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	AirPlane(){
		width = 49;
		height = 36;
		Random rand = new Random();
		x = rand.nextInt(400-this.width);
		y = (int)(Math.random()*(-700+this.height-(0-this.height+1))+(0-this.height+1));
		speed = 3;
		System.out.println("С�л���ʼ����--> (x:"+x+", y:"+y+")");
	}
	/**
	 * С�л����ƶ�(yֵ�仯)
	 */
	void step(){
		System.out.println("С�л���y�ƶ���"+speed);
	}
}
