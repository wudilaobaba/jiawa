package cn.tedu.shoot;
//小敌机的类
public class AirPlane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	AirPlane(int width,int height,int x,int y,int speed){
		width = width;
		height = height;
		x = x;
		y = y;
		speed = speed;
	}
	/**
	 * 小敌机的移动(y值变化)
	 */
	void step(){
		System.out.println("小敌机的y移动了"+speed);
	}
}
