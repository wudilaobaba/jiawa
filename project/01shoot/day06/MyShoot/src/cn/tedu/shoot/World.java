package cn.tedu.shoot;
//������
public class World {
	Sky sky;
	Hero hero;
	AirPlane[] as;
	BigAirPlane[] bas;
	Bee[] bs;
	Bullet[] bts;
	
	void action(){//���Դ���
		sky = new Sky();
		hero = new Hero();
		
		//С�л�
		as = new AirPlane[5];
		for(int i=0;i<as.length;i++){
			as[i] = new AirPlane();
		}
		
		//��л�
		bas = new BigAirPlane[2];
		for(int i=0;i<bas.length;i++){
			bas[i] = new BigAirPlane();
		}
		
		//С�۷�
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