package cn.tedu.shoot;
import javax.swing.JFrame;//������3��---step01
import javax.swing.JPanel;//������3��---step01
import java.awt.Graphics;//���ʣ���ͼƬ�õ�
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.Arrays;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;//����װͼƬ����
//������
public class World extends JPanel{//������Ҫ�̳�(ֻҪ��һ���о͵���һ�����ڣ��ͼ̳�JPanel)������3��---step02
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;
	public static final int START = 0; //����״̬
	public static final int RUNNING = 1;//����״̬
	public static final int PAUSE = 2;//��ͣ״̬
	public static final int GAME_OVER = 3;//����״̬
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
	 * ���ɵ��˶���
	 */
	public FlyingObject nextOne(){
		Random rand = new Random();
		int type = rand.nextInt(20);//0~19�������int
		if(type<4){//0~3ʱ������С�۷����
			return new Bee();
		}else if(type<12){//4~11,����С�л�����
			return new AirPlane();
		}else{//12~19ʱ,���ɴ�л�����
			return new BigAirPlane();
		}
		//���Կ����Ǹ�������������
		//��������һ����Χ���Կ��Ƹ��ʣ���д��0��1��2�ֱ����һ��������ô������������ɸ������
	}
	
	
	int enterIndex = 0;
	//�����볡��С�л� ����л� ��С�۷䣩
	public void enterAction(){
		enterIndex++;
		if(enterIndex%40==0){//ÿ400msִ��һ������Ĵ���  ���㷨������
			enemies = Arrays.copyOf(enemies, enemies.length+1);
			enemies[enemies.length-1] = nextOne();
			//�����Ժ�ϵͳ�Զ���ԭʼ����ɾ��,�����µ�����      Arrays.copyOf����Ҫ�б��������գ�����
		}
	}
	
	int shootIndex = 0;
	/*Ӣ�ۻ������ӵ�*/
	public void shootAction(){
		shootIndex++;
		if(shootIndex%30==0){
			//hero.shoot()�м���Ԫ��,��ôbullets������������
			//������һ���㷨���μ� ���㷨06.
			bullets = Arrays.copyOf(bullets, bullets.length + hero.shoot().length);
			System.arraycopy(hero.shoot(), 0, bullets, bullets.length-hero.shoot().length, hero.shoot().length);
		}
	}
	
	public void stepAction(){//���з������ƶ�
		sky.step();
		for(int i=0;i<enemies.length;i++){
			enemies[i].step();
		}
		for(int i=0;i<bullets.length;i++){
			bullets[i].step();
		}
	}
	
	public void outOfBoundsAction(){//  ���㷨07. 
		//�ڵ���������ɾ��Խ�����
		int index = 0;
		FlyingObject[] arr2 = new FlyingObject[enemies.length];
		for(int i=0;i<enemies.length;i++){
			if(!enemies[i].outOfBounds()){  //��ɾ��������ȡ��
				arr2[index] = enemies[i];
				index++;
			}
		}
		enemies = Arrays.copyOf(arr2,index);
		
		//���ӵ�������ɾ��Խ�����
		index = 0;
		Bullet[] arr3 = new Bullet[bullets.length];
		for(int i=0;i<bullets.length;i++){
			if(!bullets[i].outOfBounds()){  //��ɾ��������ȡ��
				arr3[index] = bullets[i];
				index++;
			}
		}
		bullets = Arrays.copyOf(arr3,index);
	}
	
	//�������ӵ�ײ
	int score = 0;//��ҵõ÷�
	public void bulltBangAction(){
		for(int i=0;i<enemies.length;i++){
			for(int j=0;j<bullets.length;j++){
				if(enemies[i].isLife() && bullets[j].isLife() && enemies[i].hit(bullets[j])){
					enemies[i].goDead();
					bullets[j].goDead();
					if(enemies[i] instanceof Enemy){
						Enemy enemy = (Enemy)enemies[i];//���ýӿ��еķ�����ͨ��ǿת����ʵ��(��Ϊ�ܵ����ʲôҪ������򳬽ӿ�)
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
	
	//������Ӣ�ۻ�ײ
	public void heroBangAction(){
		for(int i=0;i<enemies.length;i++){
			if(hero.isLife() && enemies[i].isLife() && enemies[i].hit(hero)){
				enemies[i].goDead();
				hero.substractLife();
				hero.clearDoubleFire();
			}
		}
	}
	
	//�����Ϸ����
	public void checkGameOverAction(){
		if(hero.getLife()<=0){
			//����Ϸ����ͼ
			state=GAME_OVER;
		}
	}
	
	public void action(){
		//װ�����������
		MouseAdapter l = new MouseAdapter(){
			public void mouseMoved(MouseEvent e){//��д�����ƶ��¼�
				if(state==RUNNING){
					hero.moveTo(e.getX(), e.getY());//e.getX(), e.getY()��ȡ����x y����
				}
			}
			public void mouseClicked(MouseEvent e){//��д���ĵ���¼�
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
			public void mouseExited(MouseEvent e){//��д�����Ƴ��¼�
				if(state==RUNNING){
					state = PAUSE;
				}
			}
			public void mouseEntered(MouseEvent e){//��д���������¼�
				if(state==PAUSE){
					state = RUNNING;
				}
			}
		};
		
		//��������װ�������
		this.addMouseListener(l);         //�������Ĳ����¼�
	    this.addMouseMotionListener(l);   //�������Ļ����¼�
		
	    //������ʱ������
	    Timer timer = new Timer();
		int interval = 10;//�Ժ���Ϊ��λ
		TimerTask aTime = new TimerTask(){//������һ�������ڲ���  TimerTask��һ��������
			public void run(){//Ҫ��д  ��ʱ�ɵ���������д
				//System.out.println(sky.x);//���Է����ⲿ�������
				if(state==RUNNING){
					enterAction();//�����볡
					shootAction();//�ӵ��볡
					stepAction();//����������Լ���step����
					outOfBoundsAction();//�Ƴ�Խ�����
					bulltBangAction();//�ӵ��������ײ
					heroBangAction();//Ӣ�ۻ��������ײ
					checkGameOverAction();//�����Ϸ����
				}
				//System.out.println(bullets.length+"   "+enemies.length);
				repaint();//�����ٵ�һ��paint����
			}
		};
		timer.schedule(aTime,interval,interval);
	}
	
	public void paint(Graphics g){ //���paint��World��ĳ���JPanel�еķ���
		sky.paintObject(g);
		hero.paintObject(g);
		for(int i=0;i<enemies.length;i++){
			enemies[i].paintObject(g);
		}
		for(int i=0;i<bullets.length;i++){
			bullets[i].paintObject(g);
		}
		//������
		g.drawString("SCORE:"+score, 10, 25);
		//����
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
		//����ֱ��Copy�������� ������3��---step03
		JFrame frame = new JFrame(); //����--����
		World world = new World();//���
		frame.add(world); //�����ӵ�������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳����ھ��Զ��رճ���
		frame.setSize(WIDTH, HEIGHT); //��С
		frame.setLocationRelativeTo(null); //��ʼλ�� ������ʾ
		frame.setVisible(true);//��ʾ-�������paint���� ------------------->���������
		world.action();  //���������ִ��
	}

}