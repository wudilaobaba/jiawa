package cn.tedu.shoot;
//���
public class Sky extends FlyingObject{
	int y1;//����ͼƬ��y������л�
	int speed;
	Sky(){
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		y1 = -700;
		speed = 1;
		System.out.println("��ճ�ʼ����--> (x:"+x+", y:"+y+")");
	}
}
