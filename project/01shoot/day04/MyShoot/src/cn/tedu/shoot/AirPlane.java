package cn.tedu.shoot;
import java.util.Random;
//小敌机的类
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
		System.out.println("小敌机初始坐标--> (x:"+x+", y:"+y+")");
	}
}
