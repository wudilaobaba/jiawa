package cn.tedu.shoot;
//子弹的类
public class Bullet extends FlyingObject{
	int speed;
	Bullet(int x,int y){
		super(8,14,x,y);
		speed = 3;
	}
	void step(){
		System.out.println("子弹的Y移动了："+speed);
	}
}
