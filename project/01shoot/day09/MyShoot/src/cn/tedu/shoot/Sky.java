package cn.tedu.shoot;
import java.awt.image.BufferedImage;//����װͼƬ����
//���
public class Sky extends FlyingObject{
	//��̬�������������
	private static BufferedImage image;
	static{
		image = loadImage("background.png");
	}
	private int y1;//����ͼƬ��y������л�
	private int speed;
	public Sky(){
		super(400,700,0,0);
		y1 = -700;
		speed = 1;
		System.out.println("��ճ�ʼ����--> (x:"+x+", y:"+y+")");
	}
	public void step(){
		System.out.println("��յ�y��y1�ƶ��ˣ�"+speed);
	}
}
