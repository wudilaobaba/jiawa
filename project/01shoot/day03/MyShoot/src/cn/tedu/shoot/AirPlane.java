package cn.tedu.shoot;
import java.util.Random;
//小敌机的类
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
		System.out.println("小敌机初始坐标--> (x:"+x+", y:"+y+")");
	}
	/**
	 * 小敌机的移动(y值变化)
	 */
	void step(){
		System.out.println("小敌机的y移动了"+speed);
	}
}
