package cn.tedu.shoot;
//Ӣ�ۻ�
public class Hero {
	int x;
	int y;
	int width;
	int height;
	int life;
	int doubleFire;
	Hero(int x,int y,int width,int height,int life,int doubleFire){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.life = life;
		this.doubleFire = doubleFire;
	}
	/**
	 * Ӣ�ۻ��Լ�����(�л�ͼƬ)
	 */
	void step(){
		System.out.println("Ӣ�ۻ��л�ͼƬ��");
	}
	/**
	 * Ӣ�ۻ���������˶�
	 * @param x ��������
	 * @param y ���������
	 */
	void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�");
	}
}
