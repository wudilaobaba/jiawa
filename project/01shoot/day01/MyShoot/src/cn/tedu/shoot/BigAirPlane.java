package cn.tedu.shoot;

public class BigAirPlane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	/**
	 * 大敌机的移动(y值变化)
	 */
	void step(){
		System.out.println("大敌机的y移动了"+speed);
	}
}
