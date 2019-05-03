package cn.tedu.shoot;
import java.awt.image.BufferedImage;//用来装图片的类
public class BigAirPlane extends FlyingObject {
	//静态建议放在最上面
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bigplane"+i+".png");
		}
	}
	private int speed;
	public BigAirPlane(){
		super(69,99);
		speed = 2;
		System.out.println("大敌机初始坐标--> (x:"+x+", y:"+y+"), 宽:"+super.width+"高:"+super.height);
	}
	public void step(){
		System.out.println("大敌机的Y移动了："+speed);
	}
	
	int deadIndex = 1;//死了状态的下标
	public BufferedImage getImage(){//该方法每10ms执行一次
		if(isLife()){
			return images[0];
		}else if(isDead()){
			BufferedImage img = images[deadIndex++];
			if(deadIndex==images.length){
				state = REMOVE;
			}
			return img;
		}
		return null;
	}
}
