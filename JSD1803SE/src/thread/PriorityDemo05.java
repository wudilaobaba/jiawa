package thread;
/**
 * �߳����ȼ�
 * �߳�֮�����ܵ��Բ������У��ǿ��̵߳��ȵĹ������̵߳��Ȼ����CPU����ʱ��Ƭ��ĳ���̣߳�ʹ����������С�
 * �̲߳���������ȡCPUʱ�䡣
 * �����̵߳����ȼ��������̶ȵĸ���ĳ���̻߳�ȡCPUʱ��Ƭ�Ĵ������������߳����ȼ�Խ�ߵ��̻߳�ȡCPUʱ��Ƭ�Ĵ���Խ�ࡣ
 * �̵߳����ȼ�������1-10��ʾ��1��������ȼ���10Ϊ������ȼ���5ΪĬ��ֵ��
 * Ҳ����˵�������̸߳�ͬ���Ļ������˭�����ȼ���˭��������� --- Ψһ�����߳�ʱ��Ƭ��Ψһ��ʽ
 * @author Administrator
 *
 */
public class PriorityDemo05 {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("MAX");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("MIN");
				}
			}
		};
		Thread normal = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("NORMAL");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
//		normal.setPriority(Thread.NORM_PRIORITY);
		
		min.start();
		normal.start();
		max.start();
	}

}
