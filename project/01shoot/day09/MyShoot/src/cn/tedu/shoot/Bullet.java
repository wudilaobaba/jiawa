package cn.tedu.shoot;
import java.awt.image.BufferedImage;//����װͼƬ����
//�ӵ�����
public class Bullet extends FlyingObject{
	//��̬�������������
	private static BufferedImage image;
	static{
		image = loadImage("bullet.png");
	}
	private int speed;
	public Bullet(int x,int y){
		super(8,14,x,y);
		speed = 3;
	}
	public void step(){
		System.out.println("�ӵ���Y�ƶ��ˣ�"+speed);
	}
}
