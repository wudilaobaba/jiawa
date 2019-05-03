package cn.tedu.shoot;
//子弹的类
public class Bullet {
	int x;
	int y;
	int speed;
	int width;
	int height;
	Bullet(int x,int y,int speed,int width,int height){
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}
	/**
	 * 子弹的移动(向上移动y为负)
	 */
	void step(){
		System.out.println("子弹移动了"+speed);
	}
}
