package cn.tedu.shoot;
//Ӣ�ۻ�
public class Hero {
	int width;
	int height;
	int x;
	int y;
	int life;
	int doubleFire;
	Hero(){
		width = 97;
		height = 124;
		x = 400/2-(this.width/2);
		y = 700-this.height-100;//��ײ���100�ľ���
		life = 3;
		System.out.println("Ӣ�ۻ���ʼ����--> (x:"+x+", y:"+y+")");
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
