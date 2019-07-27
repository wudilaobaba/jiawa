package cn.tedu.shoot;
public class BigAirPlane extends FlyingObject {
	int speed;
	BigAirPlane(){
		super(69,99);
		speed = 2;
		System.out.println("大敌机初始坐标--> (x:"+x+", y:"+y+"), 宽:"+super.width+"高:"+super.height);
	}
}
