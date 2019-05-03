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
		y-=speed;
	}
	public BufferedImage getImage(){//该方法每10ms执行一次
		if(isLife()){
			return image;
		}else if(isDead()){
			state = REMOVE;
		}
		return null;
	}
	//重写outOfBounds方法
	public boolean outOfBounds(){
		return y<=-height;
	}
}
