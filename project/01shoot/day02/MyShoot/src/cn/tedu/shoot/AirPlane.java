package cn.tedu.shoot;
//小敌机的类
public class AirPlane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	AirPlane(int width,int height,int x,int y,int speed){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.speed = speed;
	}
	/**
	 * 小敌机的移动(y值变化)
	 */
	void step(){
		System.out.println("小敌机的y移动了"+speed);
	}
}
