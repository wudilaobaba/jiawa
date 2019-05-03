package cn.tedu.shoot;
//天空
public class Sky extends FlyingObject{
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
}
