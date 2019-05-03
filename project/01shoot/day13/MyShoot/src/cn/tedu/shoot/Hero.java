package cn.tedu.shoot;
import java.awt.image.BufferedImage;//用来装图片的类
//英雄机
public class Hero extends FlyingObject{
	//静态建议放在最上面
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[2];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("hero"+i+".png");
		}
	}
	private int life;
	private int doubleFire;
	public Hero(){
		super(97,124,150,400);
		//super();//调用超类的构造方法时，必须位于派生类构造方法的第一行
		//super(); //在派生类的构造方法中，若自己不主动去调用超类的构造方法，则默认有个super()来无形之中调用超类的无参构造方法
		life = 3;
		doubleFire = 40;//0表示单倍火力，大于0则为双倍火力
		//System.out.println("英雄机初始坐标--> (x:"+x+", y:"+y+"), 宽:"+super.width+"高:"+super.height);
	}
	/**
	 * 英雄机随着鼠标运动
	 * @param x 鼠标横坐标
	 * @param y 鼠标纵坐标
	 */
	public void moveTo(int x, int y){
		this.x = x-width/2;
		this.y = y-height/2;
		if(this.x<=0){//控制左边不出界
			this.x = 0;
		}else if(this.x>=World.WIDTH-width){//控制右边不出界
			this.x = World.WIDTH-width;
		}
		if(this.y<=0){//控制上边不出界
			this.y = 0;
		}else if(this.y>=World.HEIGHT-height){//控制下边不出界
			this.y = World.HEIGHT-height;
		}
		
	}
	public void step(){
		
	}
	
	int index = 0;//活着的下标
	public BufferedImage getImage(){//每10毫秒走一次
		if(isLife()){
			return images[index++%2];//小算法
		}
		return null;
	}
	
	/* 英雄机发射子弹，生成子弹对象*/
	public Bullet[] shoot(){
		int xStep = width/4;
		int ystep = 20;
		if(doubleFire>0){//双倍
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(x + xStep, y-ystep);
			bs[1] = new Bullet(x + xStep*3, y-ystep);
			doubleFire-=2; //得一次双倍火力doubleFire+40，发一次双倍火力doubleFire-1
			return bs;
		}else{//单倍
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(x + xStep*2, y-ystep);
			return bs;
		}
	}
	
	//重写outOfBounds方法
	public boolean outOfBounds(){
		return false;
	}
	
	//加命
	public void addLife(){
		life++;
	}
	//减命
	public void substractLife(){
		life--;
	}
	//加火力值
	public void addDoubleFire(){
		doubleFire+=40;
	}
	//重置火力值
	public void clearDoubleFire(){
		doubleFire = 0;
	}
	
	//让别的类读取英雄机的life
	public int getLife(){
		return life;
	}
}
