package cn.tedu.shoot;
import java.awt.image.BufferedImage;//����װͼƬ����
//Ӣ�ۻ�
public class Hero extends FlyingObject{
	//��̬�������������
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[2];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("hero"+i+".png");
		}
	}
	private int life;
	private int doubleFire;
	public Hero(){
		super(97,124,150,400);
		//super();//���ó���Ĺ��췽��ʱ������λ�������๹�췽���ĵ�һ��
		//super(); //��������Ĺ��췽���У����Լ�������ȥ���ó���Ĺ��췽������Ĭ���и�super()������֮�е��ó�����޲ι��췽��
		this.life = 3;
		this.doubleFire = 0;
		System.out.println("Ӣ�ۻ���ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
	/**
	 * Ӣ�ۻ���������˶�
	 * @param x ��������
	 * @param y ���������
	 */
	public void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�");
	}
	public void step(){
		System.out.println("Ӣ�ۻ��л�ͼƬ��");
	}
}
