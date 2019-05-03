package cn.tedu.shoot;
//主方法
public class World {
	Sky sky = new Sky();
	Hero hero = new Hero();
	FlyingObject enemies[] = {};
	Bullet[] bullets = {};
	
	void action(){//测试代码
		enemies = new FlyingObject[5];
		enemies[0] = new AirPlane();
		enemies[1] = new BigAirPlane();
		enemies[2] = new Bee();
		enemies[3] = new AirPlane();
		enemies[4] = new BigAirPlane();
		for(int i=0;i<enemies.length;i++){
			enemies[i].step();
			//子弹射击enemies[i]
			//enemies[i]与英雄机相撞
		}
	}
	
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}

}