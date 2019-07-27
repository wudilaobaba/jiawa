package cn.tedu.shoot;
//小敌机的类
public class AirPlane extends FlyingObject{
	int speed;
	AirPlane(){
		super(49,36);
		speed = 2;
		System.out.println("小敌机初始坐标--> (x:"+x+", y:"+y+"), 宽:"+super.width+"高:"+super.height);
	}
}
