package cn.tedu.shoot;
//主方法
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
	
	void action(){//测试代码
		sky = new Sky();
		sky.width = 400;
		sky.height = 700;
		sky.x = 0;
		sky.y = 0;
		sky.y = -700;
		sky.speed = 1;
		sky.step();
		
		hero = new Hero();
		hero.width = 97;
		hero.height = 124;
		hero.x = 150;
		hero.y = 400;
		hero.life = 3;
		hero.step();
		hero.moveTo(10, 20);
		
		//小敌机
		AirPlane airPlane = new AirPlane(49,31,38,250,2);
		airPlane.step();
	}
	
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}

}