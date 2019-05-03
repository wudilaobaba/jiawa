package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;//用来装图片的类
import javax.imageio.ImageIO;//做图片读写的类
//所有飞行物的超类
public class FlyingObject {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	//以下的构造函数是专门给大敌机、小敌机、小蜜蜂提供的
	public FlyingObject(int width, int height){
		Random rand = new Random();
		this.width = width;
		this.height = height;
		this.x = rand.nextInt(400-this.width);
		this.y = -this.height;
	}
	//以下的构造函数是专门给英雄机、子弹、天空提供的...
	public FlyingObject(int width, int height, int x, int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public void step(){
		System.out.println("飞行物移动啦");
	}
	
	//读取图片,该方法的操作与对象无关
	public static BufferedImage loadImage(String fileName){
		//java的IO操作要方法try catch中
		try{
			//只能在同包之内进行读取图片
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
