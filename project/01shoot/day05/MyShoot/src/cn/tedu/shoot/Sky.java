package cn.tedu.shoot;
//天空
public class Sky extends FlyingObject{
	int y1;//两张图片的y坐标的切换
	int speed;
	Sky(){
		super(400,700,0,0);
		y1 = -700;
		speed = 1;
		System.out.println("天空初始坐标--> (x:"+x+", y:"+y+")");
	}
}
