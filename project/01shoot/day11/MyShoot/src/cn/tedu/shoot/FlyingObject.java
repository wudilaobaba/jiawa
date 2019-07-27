package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;//用来装图片的类
import javax.imageio.ImageIO;//做图片读写的类
import java.awt.Graphics;//画笔，画图片用的
//所有飞行物的超类
public abstract class FlyingObject {
	public static final int LIFE = 0;//活的状态
	public static final int DEAD = 1;//死的状态
	public static final int REMOVE = 2;//移除状态
	protected int state = LIFE;//当前状态

	protected int width;
	protected int height;
	protected int x;
	protected int y;
	//以下的构造函数是专门给大敌机、小敌机、小蜜蜂提供的
	public FlyingObject(int width, int height){
		Random rand = new Random();
		this.width = width;
		this.height = height;
		this.x = rand.nextInt(World.WIDTH-this.width);
		this.y = -this.height;
	}
	//以下的构造函数是专门给英雄机、子弹、天空提供的...
	public FlyingObject(int width, int height, int x, int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	public abstract void step();

	//读取图片,该方法的操作与对象无关，给各个类设置自己的图片数据
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

	//根据不同的状态设置对象在当前状态下需要显示哪张图片
	public abstract BufferedImage getImage();

	//判断是否活着
	public boolean isLife(){
		return state==LIFE;
	}
	//判断是否死了
	public boolean isDead(){
		return state==DEAD;
	}
	//判断是否删除
	public boolean isRemove(){
		return state==REMOVE;
	}

	//画图片 g:画笔    天空要重写
	public void paintObject(Graphics g){
		g.drawImage(getImage(),x,y,null);
	}

	//删除越界的飞行物
	public abstract boolean outOfBounds();
}
