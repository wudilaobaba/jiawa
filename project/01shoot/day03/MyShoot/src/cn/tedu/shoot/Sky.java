package cn.tedu.shoot;
//天空
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int y1;//两张图片的y坐标的切换
	int speed;
	Sky(){
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		y1 = -700;
		speed = 1;
		System.out.println("天空初始坐标--> (x:"+x+", y:"+y+")");
	}
	/**
	 * 天空的移动(其实是两张相同的图片在移动)
	 */
	void step(){
		System.out.println("天空的y和y1移动了"+speed);
	}
}
