package cn.tedu.shoot;
import javax.swing.JFrame;//������3��---step01
import javax.swing.JPanel;//������3��---step01
import java.awt.Graphics;//���ʣ���ͼƬ�õ�
//������
public class World extends JPanel{//������Ҫ�̳�(ֻҪ��һ���о͵���һ�����ڣ��ͼ̳�JPanel)������3��---step02
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
	
	
	public void action(){//���Դ���
		
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
		world.action();  //���Դ���
	}

}