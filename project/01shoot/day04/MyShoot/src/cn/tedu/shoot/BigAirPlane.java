package cn.tedu.shoot;
import java.util.Random;
public class BigAirPlane extends FlyingObject {
	int speed;
	BigAirPlane(){
		Random rand = new Random();
		width = 69;
		height = 99;
		x = rand.nextInt(400-this.width);
		y = -this.height;
		speed = 2;
		System.out.println("大敌机初始坐标--> (x:"+x+", y:"+y+")");
	}
}
