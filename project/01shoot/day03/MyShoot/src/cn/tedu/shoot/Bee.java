package cn.tedu.shoot;
import java.util.Random;
//小蜜蜂的类
public class Bee {
	int x;
	int y;
	int xSpeed;//x轴移动速度
	int ySpeed;//y轴移动速度
	int width;
	int height;
	int awardType;//奖励类型
	/**
	 * 小蜜蜂的移动
	 */
	Bee(){
		Random rand = new Random();
		width = 40;
		height = 60;
		x = rand.nextInt(400 - this.width);
		y = (int)(Math.random()*(-700+this.height - (0-this.height+1)) + (0-this.height+1));;
		System.out.println("小蜜蜂初始坐标--> (x:"+x+", y:"+y+")");
	}
	void step(){
		System.out.println("小蜜蜂初始坐标--> (x:"+x+", y:"+y+")");
	}
}
