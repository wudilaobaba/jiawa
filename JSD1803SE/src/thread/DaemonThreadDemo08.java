package thread;
/**
 * �ػ��߳�
 * �ػ��߳��ֳ�Ϊ��̨�̣߳�һ���̴߳�������Ĭ�϶�����ͨ(ǰ̨)�̣߳��ػ��߳���Ҫ���߳�����ǰ�����������á�
 * ʹ�����ػ��߳�����ͨ�߳��޲�𣬵����ڽ���ʱ������һ�㲻ͬ�����������̽���ʱ�������������е��ػ��̶߳��ᱻǿ���жϡ�
 * ���������Ҳ���ǽ��̽�������һ�������е�����ǰ̨�̶߳�����ʱ�����̼�����(�������)����ʱ�������е��ػ��̲߳Żᱻǿ���жϡ�
 * main��ǰ̨�̣߳� main�����Ƚ������߳�
 * @author Administrator
 *
 */
public class DaemonThreadDemo08 {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("Rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Rose:Aaaaaa!!!");
				System.out.println("��ͨ��");
			}
		};
		Thread batty = new Thread(){
			public void run(){
				for(int i=0;i<7;i++){
					System.out.println("Batty:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Rose:Aaaaaa!!!");
				System.out.println("��ͨ��");
			}
		};
		Thread jack = new Thread(){ //��ѭ��Ҳ�����
			public void run(){
				while(true){
					System.out.println("Jack:you jump, I jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		rose.start();
		batty.start();
		
		jack.setDaemon(true); //��ĳ���߳�����Ϊ�ػ��̵߳ķ������ұ����ڸ��̵߳�start֮ǰ��������
		jack.start();
		System.out.println("main�߳̽�����");
//		while(true){
//
//		}
//		��ʱ����while��ѭ������ômain�̻߳�û�н����������ػ��߳�jack�Ͳ��ᱻǿ���ж�
	}

}
