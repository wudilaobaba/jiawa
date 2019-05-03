package cn.tedu.shoot;
import java.awt.image.BufferedImage;//����װͼƬ����
//С�л�����
public class AirPlane extends FlyingObject{
	//��̬�������������
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("airplane"+i+".png");
		}
	}
	private int speed;
	public AirPlane(){
		super(49,36);		
		speed = 2;
		System.out.println("С�л���ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
	public void step(){
		System.out.println("С�л���Y�ƶ��ˣ�"+speed);
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
