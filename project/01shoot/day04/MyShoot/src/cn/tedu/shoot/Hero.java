package cn.tedu.shoot;
//Ӣ�ۻ�
public class Hero extends FlyingObject{
	int life;
	int doubleFire;
	Hero(){
		//super();//���ó���Ĺ��췽��ʱ������λ�������๹�췽���ĵ�һ��
		//super(); //��������Ĺ��췽���У����Լ�������ȥ���ó���Ĺ��췽������Ĭ���и�super()������֮�е��ó�����޲ι��췽��
		super.width = 97;
		super.height = 124;
		super.x = 400/2-(this.width/2);
		super.y = 400;//��ײ���100�ľ���
		this.life = 3;
		this.doubleFire = 0;
		System.out.println("Ӣ�ۻ���ʼ����--> (x:"+x+", y:"+y+")");
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
