package cn.tedu.shoot;
//������
public class World {
	Sky sky;
	Hero hero;
	AirPlane a1;
	AirPlane a2;
	BigAirPlane ba1;
	BigAirPlane ba2;
	Bee b1;
	Bee b2;
	Bullet bt1;
	Bullet bt2;
	
	void action(){//���Դ���
		sky = new Sky(400,700,0,0,-700,1);
		sky.step();
		
		hero = new Hero(97,124,150,400,3,20);
		hero.step();
		hero.moveTo(10, 20);
		
		//С�л�
		AirPlane airPlane = new AirPlane(49,31,38,250,2);
		airPlane.step();
	}
	
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}

}