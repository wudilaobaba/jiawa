package cn.tedu.shoot;
//�ӵ�����
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
	 * �ӵ����ƶ�(�����ƶ�yΪ��)
	 */
	void step(){
		System.out.println("�ӵ��ƶ���"+speed);
	}
}
