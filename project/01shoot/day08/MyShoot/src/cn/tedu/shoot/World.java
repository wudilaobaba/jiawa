package cn.tedu.shoot;
import javax.swing.JFrame;//������3��---step01
import javax.swing.JPanel;//������3��---step01
//������
public class World extends JPanel{//������Ҫ�̳�(ֻҪ��һ���о͵���һ�����ڣ��ͼ̳�JPanel)������3��---step02
	Sky sky = new Sky();
	Hero hero = new Hero();
	FlyingObject enemies[] = {};
	Bullet[] bullets = {};

	void action(){//���Դ���
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
			//�ӵ�����enemies[i]
			//enemies[i]��Ӣ�ۻ���ײ
		}
	}

	public static void main(String[] args) {
		//����ֱ��Copy�������� ������3��---step03
		JFrame frame = new JFrame(); //����--����
		World world = new World();//����
		frame.add(world); //�������ӵ�������

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳����ھ��Զ��رճ���
		frame.setSize(400, 700); //��С
		frame.setLocationRelativeTo(null); //��ʼλ�� ������ʾ
		frame.setVisible(true);//��ʾ-��������paint����
		world.action();  //���Դ���
	}

}
