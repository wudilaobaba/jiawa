package cn.tedu.shoot;
//Ӣ�ۻ�
public class Hero {
	int x;
	int y;
	int width;
	int height;
	int life;
	int doubleFire;
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
