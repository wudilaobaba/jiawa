package cn.tedu.shoot;
import java.awt.Graphics;
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
		super(World.WIDTH,World.HEIGHT,0,0);
		y1 = -this.height;
		speed = 1;
		System.out.println("��ճ�ʼ����--> (x:"+x+", y:"+y+")");
	}
	public void step(){
		System.out.println("��յ�y��y1�ƶ��ˣ�"+speed);
	}
	
	public BufferedImage getImage(){//�÷���ÿ10msִ��һ��
		return image;
	}
	
	public void paintObject(Graphics g){
		g.drawImage(getImage(),x,y,null);
		g.drawImage(getImage(),x,y1,null);
	}
}
