package cn.tedu.shoot;
//英雄机
public class Hero {
	int x;
	int y;
	int width;
	int height;
	int life;
	int doubleFire;
	Hero(int x,int y,int width,int height,int life,int doubleFire){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.life = life;
		this.doubleFire = doubleFire;
	}
	/**
	 * 英雄机自己抖动(切换图片)
	 */
	void step(){
		System.out.println("英雄机切换图片了");
	}
	/**
	 * 英雄机随着鼠标运动
	 * @param x 鼠标横坐标
	 * @param y 鼠标纵坐标
	 */
	void moveTo(int x, int y){
		System.out.println("英雄机随着鼠标移动");
	}
}
