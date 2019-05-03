package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;//����װͼƬ����
import javax.imageio.ImageIO;//��ͼƬ��д����
//���з�����ĳ���
public class FlyingObject {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	//���µĹ��캯����ר�Ÿ���л���С�л���С�۷��ṩ��
	public FlyingObject(int width, int height){
		Random rand = new Random();
		this.width = width;
		this.height = height;
		this.x = rand.nextInt(400-this.width);
		this.y = -this.height;
	}
	//���µĹ��캯����ר�Ÿ�Ӣ�ۻ����ӵ�������ṩ��...
	public FlyingObject(int width, int height, int x, int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public void step(){
		System.out.println("�������ƶ���");
	}
	
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
}
