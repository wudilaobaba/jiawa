package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;//用来装图片的类
//小蜜蜂的类
public class Bee extends FlyingObject{
	//静态建议放在最上面
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[4];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;//x轴移动速度
	private int ySpeed;//y轴移动速度
	private int awardType;//奖励类型
	private int xDirection;//控制小蜜蜂的初始向左还是向右
	/**
	 * 小蜜蜂的移动
	 */
	public Bee(){
		super(60,50);
		Random rand = new Random();
		xSpeed = 1;
		ySpeed = 2;
		awardType = rand.nextInt(2);//0或1
		xDirection = rand.nextInt(2)==0?-1:1;
		//System.out.println("小蜜蜂初始坐标--> (x:"+x+", y:"+y+"), 宽:"+super.width+"高:"+super.height);
	}
	public void step(){
		y+=ySpeed;
		x+=xSpeed*xDirection;
		if(x==0 || x==World.WIDTH-width){
			xDirection *= -1;
		}
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
	
	//重写outOfBounds方法
	public boolean outOfBounds(){
		return y>=World.HEIGHT;
	}
}
