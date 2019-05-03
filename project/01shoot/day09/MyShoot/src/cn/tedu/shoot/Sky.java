package cn.tedu.shoot;
import java.awt.image.BufferedImage;//用来装图片的类
//天空
public class Sky extends FlyingObject{
	//静态建议放在最上面
	private static BufferedImage image;
	static{
		image = loadImage("background.png");
	}
	private int y1;//两张图片的y坐标的切换
	private int speed;
	public Sky(){
		super(400,700,0,0);
		y1 = -700;
		speed = 1;
		System.out.println("天空初始坐标--> (x:"+x+", y:"+y+")");
	}
	public void step(){
		System.out.println("天空的y和y1移动了："+speed);
	}
}
