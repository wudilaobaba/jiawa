package cn.tedu.shoot;
//С�л�����
public class AirPlane extends FlyingObject{
	int speed;
	AirPlane(){
		super(49,36);		
		speed = 2;
		System.out.println("С�л���ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
	void step(){
		System.out.println("С�л���Y�ƶ��ˣ�"+speed);
	}
}
