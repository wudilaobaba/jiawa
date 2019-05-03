package cn.tedu.shoot;
import javax.swing.JFrame;//画窗口3步---step01
import javax.swing.JPanel;//画窗口3步---step01
//主方法
public class World extends JPanel{//画窗口要继承(只要想一运行就弹出一个窗口，就继承JPanel)画窗口3步---step02
	private Sky sky = new Sky();
	private Hero hero = new Hero();
	private FlyingObject enemies[] = {};
	private Bullet[] bullets = {};
	
	public void action(){//测试代码
		sky.step();
		hero.step();
		bullets = new Bullet[1];
		bullets[0] = new Bullet(1,2);
		bullets[0].step();
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
		//以下直接Copy过来即可 画窗口3步---step03
		JFrame frame = new JFrame(); //窗口--画框
		World world = new World();//面板
		frame.add(world); //将面板加到窗口中
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出窗口就自动关闭程序
		frame.setSize(400, 700); //大小
		frame.setLocationRelativeTo(null); //初始位置 居中显示
		frame.setVisible(true);//显示-尽快调用paint方法
		world.action();  //测试代码
	}

}