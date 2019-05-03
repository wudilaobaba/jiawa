package cn.tedu.shoot;
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
	void step(){
		System.out.println("小蜜蜂移动了x:"+xSpeed+"和y:"+ySpeed);
	}
}
