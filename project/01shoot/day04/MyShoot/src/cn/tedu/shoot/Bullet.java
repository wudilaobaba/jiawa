package cn.tedu.shoot;
//�ӵ�����
public class Bullet extends FlyingObject{
	int speed;
	Bullet(int x,int y){
		width = 8;
		height = 14;
		this.x = x;
		this.y = y;
		speed = 3;
	}
}
