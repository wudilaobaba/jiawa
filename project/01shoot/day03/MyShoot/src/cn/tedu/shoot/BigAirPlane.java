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
		System.out.println("大敌机初始坐标--> (x:"+x+", y:"+y+")");
	}
	/**
	 * 大敌机的移动(y值变化)
	 */
	void step(){
		System.out.println("大敌机的y移动了"+speed);
	}
}
