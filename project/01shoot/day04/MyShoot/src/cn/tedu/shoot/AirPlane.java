package cn.tedu.shoot;
import java.util.Random;
//С�л�����
public class AirPlane extends FlyingObject{
	int speed;
	AirPlane(){
		width = 49;
		height = 36;
		speed = 3;
		Random rand = new Random();
		x = rand.nextInt(400-this.width);
		y = -this.height;
		speed = 2;
		System.out.println("С�л���ʼ����--> (x:"+x+", y:"+y+")");
	}
}
