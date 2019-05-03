package cn.tedu.shoot;
import java.awt.image.BufferedImage;//����װͼƬ����
//С�л�����
public class AirPlane extends FlyingObject implements Enemy{
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
		//System.out.println("С�л���ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
	public void step(){
		y+=speed;
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
	
	//��дoutOfBounds����
	public boolean outOfBounds(){
		return y>=World.HEIGHT;
	}
	
	//��д�ӿ��е�getScore  ����С�л���1��
	public int getScore(){
		return 1;
	}
}
