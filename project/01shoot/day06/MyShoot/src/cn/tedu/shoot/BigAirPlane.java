package cn.tedu.shoot;
public class BigAirPlane extends FlyingObject {
	int speed;
	BigAirPlane(){
		super(69,99);
		speed = 2;
		System.out.println("��л���ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
}
