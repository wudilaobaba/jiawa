package cn.tedu.shoot;
import java.util.Random;
//小蜜蜂的类
public class Bee extends FlyingObject{
	int xSpeed;//x轴移动速度
	int ySpeed;//y轴移动速度
	int awardType;//奖励类型
	/**
	 * 小蜜蜂的移动
	 */
	Bee(){
		Random rand = new Random();
		width = 60;
		height = 50;
		x = rand.nextInt(400 - this.width);
		y = -this.height;
		xSpeed = 1;
		ySpeed = 2;
		awardType = rand.nextInt(2);//0或1
		System.out.println("小蜜蜂初始坐标--> (x:"+x+", y:"+y+")");
	}
}
