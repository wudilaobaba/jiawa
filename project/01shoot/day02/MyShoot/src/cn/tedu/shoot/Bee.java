package cn.tedu.shoot;
//С�۷����
public class Bee {
	int x;
	int y;
	int xSpeed;//x���ƶ��ٶ�
	int ySpeed;//y���ƶ��ٶ�
	int width;
	int height;
	int awardType;//��������
	Bee(int x,int y,int xSpeed,int ySpeed,int width,int height,int awardType){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.width = width;
		this.height = height;
		this.awardType = awardType;
	}
	/**
	 * С�۷���ƶ�
	 */
	void step(){
		System.out.println("С�۷��ƶ���x:"+xSpeed+"��y:"+ySpeed);
	}
}
