package thread;
/**
 * ���˯������
 * @author Administrator
 *
 */
public class SleepDemo07 {
	public static void main(String[] args) {
		Thread lin = new Thread(){
			public void run(){
				System.out.println("�֣��������ݣ�˯һ���");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("�֣������أ������أ������أ����������ˣ�");
				}
				System.out.println("�֣������ǳ����ˣ�������������");
			}
		};
		lin.start();
		
		Thread huang = new Thread(){
			public void run(){
				System.out.println("�ƣ���ʼ��ǽ��");
				for(int i=0;i<5;i++){
					System.out.println("�ƣ�80��");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("�۵���");
				System.out.println("�ƣ��㶨");
				
				//�ж��߳�lin ��ʱ��lin�߳�������˯��״̬��
				//�ж�˯�ߺ�lin�̼߳�����������
				//��linδ˯�ߣ���ôִ��������жϷ�������ֱ����ԭ��ͣ����
				lin.interrupt();//�����ж�
			}
		};
		huang.start();
	}

}
