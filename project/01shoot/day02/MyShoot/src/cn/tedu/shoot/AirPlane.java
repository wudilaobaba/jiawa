package cn.tedu.shoot;
//С�л�����
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
	 * С�л����ƶ�(yֵ�仯)
	 */
	void step(){
		System.out.println("С�л���y�ƶ���"+speed);
	}
}
