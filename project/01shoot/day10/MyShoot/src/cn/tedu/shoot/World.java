package cn.tedu.shoot;
import javax.swing.JFrame;//画窗口3步---step01
import javax.swing.JPanel;//画窗口3步---step01
import java.awt.Graphics;//画笔，画图片用的
//主方法
public class World extends JPanel{//画窗口要继承(只要想一运行就弹出一个窗口，就继承JPanel)画窗口3步---step02
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;
	private Sky sky = new Sky();
	private Hero hero = new Hero();
	private FlyingObject[] enemies = {
		new AirPlane(),
		new Bee(),
		new BigAirPlane()
	};
	private Bullet[] bullets = {
		new Bullet(hero.x+10,hero.y-30),
		new Bullet(hero.x+80,hero.y-30),
	};
	
	
	public void action(){//测试代码
		
	}
	
	public void paint(Graphics g){ //这个paint是World类的超类JPanel中的方法
		sky.paintObject(g);
		hero.paintObject(g);
		for(int i=0;i<enemies.length;i++){
			enemies[i].paintObject(g);
		}
		for(int i=0;i<bullets.length;i++){
			bullets[i].paintObject(g);
		}
		
	}
	
	public static void main(String[] args) {
		//以下直接Copy过来即可 画窗口3步---step03
		JFrame frame = new JFrame(); //窗口--画框
		World world = new World();//面板
		frame.add(world); //将面板加到窗口中
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出窗口就自动关闭程序
		frame.setSize(WIDTH, HEIGHT); //大小
		frame.setLocationRelativeTo(null); //初始位置 居中显示
		frame.setVisible(true);//显示-尽快调用paint方法 ------------------->看这里！！！
		world.action();  //测试代码
	}

}