package cn.tedu.shoot;
import java.awt.image.BufferedImage;//用来装图片的类
//子弹的类
public class Bullet extends FlyingObject{
	//静态建议放在最上面
	private static BufferedImage image;
	static{
		image = loadImage("bullet.png");
	}
	private int speed;
	public Bullet(int x,int y){
		super(8,14,x,y);
		speed = 3;
	}
	public void step(){
		System.out.println("子弹的Y移动了："+speed);
	}
}
