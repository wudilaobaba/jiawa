package thread;
/**
 * join��������Э���߳�֮���ͬ������
 * join�����������и÷������̴߳�������״̬��ֱ���÷��������߳�������ϲŻ�������
 * @author Administrator
 * �����غ�ͼƬ����ʾͼƬ�����ܲ���
 */
public class JoinDemo09 {
	//ͼƬ�Ƿ��������
	private static boolean isFinish = false;
	public static void main(String[] args) {
		Thread down = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ...");
				for(int i=0;i<100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("�������");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ");
				
				//�ȵȴ�down�߳̽�ͼƬ�����ټ���   �ȴ�down�߳�ִ������ִ���Լ�
				try {
					down.join(); //���Լ���������ִ��down�߳���ִ���Լ�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(!isFinish){
					throw new RuntimeException("ͼƬ����ʧ��");
				}
				System.out.println("show:ͼƬ��ʾ��");
			}
		};
		down.start();
		show.start();
	}
}

