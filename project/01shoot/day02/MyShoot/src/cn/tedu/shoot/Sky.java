package cn.tedu.shoot;
//���
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int y1;//����ͼƬ��y������л�
	int speed;
	Sky(int width,int height,int x,int y,int y1,int speed){
		this.speed = speed;
		this.height = height;
		this.x = x;
		this.y = y;
		this.y1 = y1;
		this.speed = speed;
	}
	/**
	 * ��յ��ƶ�(��ʵ��������ͬ��ͼƬ���ƶ�)
	 */
	void step(){
		System.out.println("��յ�y��y1�ƶ���"+speed);
	}
}
