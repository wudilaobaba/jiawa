package cn.tedu.shoot;
//���
public class Sky extends FlyingObject{
	int y1;//����ͼƬ��y������л�
	int speed;
	Sky(){
		super(400,700,0,0);
		y1 = -700;
		speed = 1;
		System.out.println("��ճ�ʼ����--> (x:"+x+", y:"+y+")");
	}
}
