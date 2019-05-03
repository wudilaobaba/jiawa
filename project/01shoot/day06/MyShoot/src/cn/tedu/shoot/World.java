package cn.tedu.shoot;
//主方法
public class World {
	Sky sky;
	Hero hero;
	AirPlane[] as;
	BigAirPlane[] bas;
	Bee[] bs;
	Bullet[] bts;
	
	void action(){//测试代码
		sky = new Sky();
		hero = new Hero();
		
		//小敌机
		as = new AirPlane[5];
		for(int i=0;i<as.length;i++){
			as[i] = new AirPlane();
		}
		
		//大敌机
		bas = new BigAirPlane[2];
		for(int i=0;i<bas.length;i++){
			bas[i] = new BigAirPlane();
		}
		
		//小蜜蜂
		bs = new Bee[3];
		for(int i=0;i<bs.length;i++){
			bs[i] = new Bee();
			bs[i].step();
		}
	}
	
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}

}