package cn.tedu.shoot;
//�ӵ�����
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
	 * �ӵ����ƶ�(�����ƶ�yΪ��)
	 */
	void step(){
		System.out.println("�ӵ��ƶ���"+speed);
	}
}
