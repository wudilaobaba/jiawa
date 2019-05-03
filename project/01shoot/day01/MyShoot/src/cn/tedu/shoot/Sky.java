package cn.tedu.shoot;
//天空
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int y1;//两张图片的y坐标的切换
	int speed;
	/**
	 * 天空的移动(其实是两张相同的图片在移动)
	 */
	void step(){
		System.out.println("天空的y和y1移动了"+speed);
	}
}
