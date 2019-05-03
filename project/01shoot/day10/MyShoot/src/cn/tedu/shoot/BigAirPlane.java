package cn.tedu.shoot;
import java.awt.image.BufferedImage;//����װͼƬ����
public class BigAirPlane extends FlyingObject {
	//��̬�������������
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bigplane"+i+".png");
		}
	}
	private int speed;
	public BigAirPlane(){
		super(69,99);
		speed = 2;
		System.out.println("��л���ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
	public void step(){
		System.out.println("��л���Y�ƶ��ˣ�"+speed);
	}
	
	int deadIndex = 1;//����״̬���±�
	public BufferedImage getImage(){//�÷���ÿ10msִ��һ��
		if(isLife()){
			return images[0];
		}else if(isDead()){
			BufferedImage img = images[deadIndex++];
			if(deadIndex==images.length){
				state = REMOVE;
			}
			return img;
		}
		return null;
	}
}
