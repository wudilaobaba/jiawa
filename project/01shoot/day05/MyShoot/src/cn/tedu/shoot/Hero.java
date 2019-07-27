package cn.tedu.shoot;
//英雄机
public class Hero extends FlyingObject{
	int life;
	int doubleFire;
	Hero(){
		super(97,124,150,400);
		//super();//调用超类的构造方法时，必须位于派生类构造方法的第一行
		//super(); //在派生类的构造方法中，若自己不主动去调用超类的构造方法，则默认有个super()来无形之中调用超类的无参构造方法
		this.life = 3;
		this.doubleFire = 0;
		System.out.println("英雄机初始坐标--> (x:"+x+", y:"+y+"), 宽:"+super.width+"高:"+super.height);
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
