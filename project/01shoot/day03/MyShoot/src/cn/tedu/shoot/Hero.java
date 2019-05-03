package cn.tedu.shoot;
//英雄机
public class Hero {
	int width;
	int height;
	int x;
	int y;
	int life;
	int doubleFire;
	Hero(){
		width = 97;
		height = 124;
		x = 400/2-(this.width/2);
		y = 700-this.height-100;//距底部有100的距离
		life = 3;
		System.out.println("英雄机初始坐标--> (x:"+x+", y:"+y+")");
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
