package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;//����װͼƬ����
import javax.imageio.ImageIO;//��ͼƬ��д����
import java.awt.Graphics;//���ʣ���ͼƬ�õ�
//���з�����ĳ���
public abstract class FlyingObject {
	public static final int LIFE = 0;//���״̬
	public static final int DEAD = 1;//����״̬
	public static final int REMOVE = 2;//�Ƴ�״̬
	protected int state = LIFE;//��ǰ״̬
	
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	//���µĹ��캯����ר�Ÿ���л���С�л���С�۷��ṩ��
	public FlyingObject(int width, int height){
		Random rand = new Random();
		this.width = width;
		this.height = height;
		this.x = rand.nextInt(World.WIDTH-this.width);
		this.y = -this.height;
	}
	//���µĹ��캯����ר�Ÿ�Ӣ�ۻ����ӵ�������ṩ��...
	public FlyingObject(int width, int height, int x, int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public abstract void step();
	
	//��ȡͼƬ,�÷����Ĳ���������޹�
	public static BufferedImage loadImage(String fileName){
		//java��IO����Ҫ����try catch��
		try{
			//ֻ����ͬ��֮�ڽ��ж�ȡͼƬ
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	//��ȡͼƬ
	public abstract BufferedImage getImage();
	
	//�ж��Ƿ����
	public boolean isLife(){
		return state==LIFE;
	}
	//�ж��Ƿ�����
	public boolean isDead(){
		return state==DEAD;
	}
	//�ж��Ƿ�ɾ��
	public boolean isRemove(){
		return state==REMOVE;
	}
	
	//��ͼƬ g:����    ���Ҫ��д
	public void paintObject(Graphics g){
		g.drawImage(getImage(),x,y,null);
	}
}
