package thread;
/**
 * sleep����
 * �߳��ṩ�ķ�������̬����
 * static void sleep(long ms) ����������CPU�ƹ����ֳ�
 * �÷������������и÷������̴߳�������״ָ̬�����볬ʱ���̻߳����»ص�RUNNABLE״̬��
 * �ȴ�����CPUʱ��Ƭ�ٴν���֮ǰ��ִ��״̬�������С�
 * @author Administrator
 *
 */
public class SleepDemo06 {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			/*
			 *ͨ���������߳���������ķ�����Ҫ�����ж��쳣
			 *�߳���һ������:interrupt() -- �ж��̵߳�����״̬
			 *�÷��������ж�һ���������е��̡߳����������߳�������ĳ������ʱ�������жϷ����жϣ���ô�����ǽ����߳�ֱ���жϣ�
			 *�����ж�������״̬����ʱͨ�����׳��ж��쳣��֪ͨ�ó����̵߳�����״̬����ϡ� 
			 */
			Thread.sleep(5000); //���и�sleep�������߳���main�̣߳�main�߳�ִ�����������5000ms
		} catch (InterruptedException e) {//�ж��쳣
			e.printStackTrace();
		}
		System.out.println("���������");
	}

}
