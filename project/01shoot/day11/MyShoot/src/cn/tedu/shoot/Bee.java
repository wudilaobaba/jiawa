package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;//����װͼƬ����
//С�۷����
public class Bee extends FlyingObject{
	//��̬�������������
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[4];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;//x���ƶ��ٶ�
	private int ySpeed;//y���ƶ��ٶ�
	private int awardType;//��������
	private int xDirection;//����С�۷�ĳ�ʼ����������
	/**
	 * С�۷���ƶ�
	 */
	public Bee(){
		super(60,50);
		Random rand = new Random();
		xSpeed = 1;
		ySpeed = 2;
		awardType = rand.nextInt(2);//0��1
		xDirection = rand.nextInt(2)==0?-1:1;
		//System.out.println("С�۷��ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
	public void step(){
		y+=ySpeed;
		x+=xSpeed*xDirection;
		if(x==0 || x==World.WIDTH-width){
			xDirection *= -1;
		}
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
}
