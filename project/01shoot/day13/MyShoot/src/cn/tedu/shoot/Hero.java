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
		life = 3;
		doubleFire = 40;//0��ʾ��������������0��Ϊ˫������
		//System.out.println("Ӣ�ۻ���ʼ����--> (x:"+x+", y:"+y+"), ��:"+super.width+"��:"+super.height);
	}
	/**
	 * Ӣ�ۻ���������˶�
	 * @param x ��������
	 * @param y ���������
	 */
	public void moveTo(int x, int y){
		this.x = x-width/2;
		this.y = y-height/2;
		if(this.x<=0){//������߲�����
			this.x = 0;
		}else if(this.x>=World.WIDTH-width){//�����ұ߲�����
			this.x = World.WIDTH-width;
		}
		if(this.y<=0){//�����ϱ߲�����
			this.y = 0;
		}else if(this.y>=World.HEIGHT-height){//�����±߲�����
			this.y = World.HEIGHT-height;
		}
		
	}
	public void step(){
		
	}
	
	int index = 0;//���ŵ��±�
	public BufferedImage getImage(){//ÿ10������һ��
		if(isLife()){
			return images[index++%2];//С�㷨
		}
		return null;
	}
	
	/* Ӣ�ۻ������ӵ��������ӵ�����*/
	public Bullet[] shoot(){
		int xStep = width/4;
		int ystep = 20;
		if(doubleFire>0){//˫��
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(x + xStep, y-ystep);
			bs[1] = new Bullet(x + xStep*3, y-ystep);
			doubleFire-=2; //��һ��˫������doubleFire+40����һ��˫������doubleFire-1
			return bs;
		}else{//����
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(x + xStep*2, y-ystep);
			return bs;
		}
	}
	
	//��дoutOfBounds����
	public boolean outOfBounds(){
		return false;
	}
	
	//����
	public void addLife(){
		life++;
	}
	//����
	public void substractLife(){
		life--;
	}
	//�ӻ���ֵ
	public void addDoubleFire(){
		doubleFire+=40;
	}
	//���û���ֵ
	public void clearDoubleFire(){
		doubleFire = 0;
	}
	
	//�ñ�����ȡӢ�ۻ���life
	public int getLife(){
		return life;
	}
}
