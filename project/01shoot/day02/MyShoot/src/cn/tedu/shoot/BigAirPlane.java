package cn.tedu.shoot;

public class BigAirPlane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	BigAirPlane(int width,int height,int x,int y,int speed){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.speed = speed;
	}
	/**
	 * ��л����ƶ�(yֵ�仯)
	 */
	void step(){
		System.out.println("��л���y�ƶ���"+speed);
	}
}
