package cn.tedu.shoot;
//天空
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int y1;//两张图片的y坐标的切换
	int speed;
	Sky(int width,int height,int x,int y,int y1,int speed){
		this.speed = speed;
		this.height = height;
		this.x = x;
		this.y = y;
		this.y1 = y1;
		this.speed = speed;
	}
	/**
	 * 天空的移动(其实是两张相同的图片在移动)
	 */
	void step(){
		System.out.println("天空的y和y1移动了"+speed);
	}
}
