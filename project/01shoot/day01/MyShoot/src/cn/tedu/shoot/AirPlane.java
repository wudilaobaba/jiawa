package cn.tedu.shoot;
//С�л�����
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
	 * С�л����ƶ�(yֵ�仯)
	 */
	void step(){
		System.out.println("С�л���y�ƶ���"+speed);
	}
}
