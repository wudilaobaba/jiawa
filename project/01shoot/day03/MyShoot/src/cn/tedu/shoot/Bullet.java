package cn.tedu.shoot;
//子弹的类
public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int speed;
	Bullet(){
		width = 8;
		height = 14;
	}
	/**
	 * 子弹的移动(向上移动y为负)
	 */
	void step(){
		System.out.println("子弹移动了"+speed);
	}
}
