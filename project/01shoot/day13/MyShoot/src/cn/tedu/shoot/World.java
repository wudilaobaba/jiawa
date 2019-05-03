package cn.tedu.shoot;
import javax.swing.JFrame;//画窗口3步---step01
import javax.swing.JPanel;//画窗口3步---step01
import java.awt.Graphics;//画笔，画图片用的
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.Arrays;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;//用来装图片的类
//主方法
public class World extends JPanel{//画窗口要继承(只要想一运行就弹出一个窗口，就继承JPanel)画窗口3步---step02
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;
	public static final int START = 0; //启动状态
	public static final int RUNNING = 1;//运行状态
	public static final int PAUSE = 2;//暂停状态
	public static final int GAME_OVER = 3;//结束状态
	private static BufferedImage start;
	private static BufferedImage pause;
	private static BufferedImage gameover;
	static{
		start = FlyingObject.loadImage("start.png");
		pause = FlyingObject.loadImage("pause.png");
		gameover = FlyingObject.loadImage("gameover.png");
	}
	private int state = START; 
	private Sky sky = new Sky();
	private Hero hero = new Hero();
	private FlyingObject[] enemies = {};
	private Bullet[] bullets = {};
	
	
	/*
	 * 生成敌人对象
	 */
	public FlyingObject nextOne(){
		Random rand = new Random();
		int type = rand.nextInt(20);//0~19的随机数int
		if(type<4){//0~3时，生成小蜜蜂对象
			return new Bee();
		}else if(type<12){//4~11,生成小敌机对象
			return new AirPlane();
		}else{//12~19时,生成大敌机对象
			return new BigAirPlane();
		}
		//可以控制那个对象数量更多
		//以上生成一个范围可以控制概率，若写成0，1，2分别代表一个对象，那么三个对象的生成概率相等
	}
	
	
	int enterIndex = 0;
	//敌人入场（小敌机 、大敌机 、小蜜蜂）
	public void enterAction(){
		enterIndex++;
		if(enterIndex%40==0){//每400ms执行一次里面的代码  好算法！！！
			enemies = Arrays.copyOf(enemies, enemies.length+1);
			enemies[enemies.length-1] = nextOne();
			//扩容以后系统自动将原始数组删除,保留新的数组      Arrays.copyOf必须要有变量来接收！！！
		}
	}
	
	int shootIndex = 0;
	/*英雄机发射子弹*/
	public void shootAction(){
		shootIndex++;
		if(shootIndex%30==0){
			//hero.shoot()有几个元素,那么bullets就扩几个容量
			//以下是一个算法，牢记 见算法06.
			bullets = Arrays.copyOf(bullets, bullets.length + hero.shoot().length);
			System.arraycopy(hero.shoot(), 0, bullets, bullets.length-hero.shoot().length, hero.shoot().length);
		}
	}
	
	public void stepAction(){//所有飞行物移动
		sky.step();
		for(int i=0;i<enemies.length;i++){
			enemies[i].step();
		}
		for(int i=0;i<bullets.length;i++){
			bullets[i].step();
		}
	}
	
	public void outOfBoundsAction(){//  见算法07. 
		//在敌人数组中删除越界对象
		int index = 0;
		FlyingObject[] arr2 = new FlyingObject[enemies.length];
		for(int i=0;i<enemies.length;i++){
			if(!enemies[i].outOfBounds()){  //将删除的条件取反
				arr2[index] = enemies[i];
				index++;
			}
		}
		enemies = Arrays.copyOf(arr2,index);
		
		//在子弹数组中删除越界对象
		index = 0;
		Bullet[] arr3 = new Bullet[bullets.length];
		for(int i=0;i<bullets.length;i++){
			if(!bullets[i].outOfBounds()){  //将删除的条件取反
				arr3[index] = bullets[i];
				index++;
			}
		}
		bullets = Arrays.copyOf(arr3,index);
	}
	
	//敌人与子弹撞
	int score = 0;//玩家得得分
	public void bulltBangAction(){
		for(int i=0;i<enemies.length;i++){
			for(int j=0;j<bullets.length;j++){
				if(enemies[i].isLife() && bullets[j].isLife() && enemies[i].hit(bullets[j])){
					enemies[i].goDead();
					bullets[j].goDead();
					if(enemies[i] instanceof Enemy){
						Enemy enemy = (Enemy)enemies[i];//想用接口中的方法，通过强转可以实现(因为能点出来什么要看超类或超接口)
						score += enemy.getScore();
					}
					if(enemies[i] instanceof Award){
						Award enemy = (Award)enemies[i];
						int type = enemy.getAwardType();
						switch(type){
							case Award.DOUBLE_FIRE:
								hero.addDoubleFire();
								break;
							case Award.LIFE:
								hero.addLife();
								break;
						}
					}
				}
			}
		}
	}
	
	//敌人与英雄机撞
	public void heroBangAction(){
		for(int i=0;i<enemies.length;i++){
			if(hero.isLife() && enemies[i].isLife() && enemies[i].hit(hero)){
				enemies[i].goDead();
				hero.substractLife();
				hero.clearDoubleFire();
			}
		}
	}
	
	//检测游戏结束
	public void checkGameOverAction(){
		if(hero.getLife()<=0){
			//贴游戏结束图
			state=GAME_OVER;
		}
	}
	
	public void action(){
		//装入鼠标侦听器
		MouseAdapter l = new MouseAdapter(){
			public void mouseMoved(MouseEvent e){//重写鼠标的移动事件
				if(state==RUNNING){
					hero.moveTo(e.getX(), e.getY());//e.getX(), e.getY()获取鼠标的x y坐标
				}
			}
			public void mouseClicked(MouseEvent e){//重写鼠标的点击事件
				switch(state){
					case START:
						state=RUNNING;
						break;
					case GAME_OVER:
						sky = new Sky();
						hero = new Hero();
						enemies = new FlyingObject[0];
						bullets = new Bullet[0];
						score = 0;
						state=START;
						break;
				}
			}
			public void mouseExited(MouseEvent e){//重写鼠标的移出事件
				if(state==RUNNING){
					state = PAUSE;
				}
			}
			public void mouseEntered(MouseEvent e){//重写鼠标的移入事件
				if(state==PAUSE){
					state = RUNNING;
				}
			}
		};
		
		//将侦听器装到面板上
		this.addMouseListener(l);         //处理鼠标的操作事件
	    this.addMouseMotionListener(l);   //处理鼠标的滑动事件
		
	    //创建定时器对象
	    Timer timer = new Timer();
		int interval = 10;//以毫秒为单位
		TimerTask aTime = new TimerTask(){//创建了一个匿名内部类  TimerTask是一个抽象类
			public void run(){//要重写  定时干的事在这里写
				//System.out.println(sky.x);//可以访问外部类的数据
				if(state==RUNNING){
					enterAction();//敌人入场
					shootAction();//子弹入场
					stepAction();//飞行物调用自己的step方法
					outOfBoundsAction();//移出越界对象
					bulltBangAction();//子弹与敌人碰撞
					heroBangAction();//英雄机与敌人碰撞
					checkGameOverAction();//检测游戏结束
				}
				//System.out.println(bullets.length+"   "+enemies.length);
				repaint();//就是再调一次paint方法
			}
		};
		timer.schedule(aTime,interval,interval);
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
		//画分数
		g.drawString("SCORE:"+score, 10, 25);
		//画命
		g.drawString("LIFE:"+hero.getLife(), 10, 45);
		//
		switch(state){
			case START:
				g.drawImage(start,0,0,null);
				break;
			case PAUSE:
				g.drawImage(pause,0,0,null);
				break;
			case GAME_OVER:
				g.drawImage(gameover,0,0,null);
				break;
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
		world.action();  //启动程序的执行
	}

}