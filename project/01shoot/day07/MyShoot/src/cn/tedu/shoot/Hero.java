package cn.tedu.shoot;
//Ӣ�ۻ�
public class Hero extends FlyingObject{
	int life;
	int doubleFire;
	Hero(){
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
	void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�");
	}
}
