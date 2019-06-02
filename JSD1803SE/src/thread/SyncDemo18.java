package thread;
/**
 * ��������
 * ������̶߳������Լ����������Ƕ��ȶԷ����ͷ���ʱ���ͻ����"����"�����ʹ�������߳̽�������״̬��
 * @author Administrator
 *
 */
public class SyncDemo18 {
	public static void main(String[] args) {
		Eoo e = new Eoo();
		Thread t1 = new Thread(){
			public void run(){
				e.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				e.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Eoo{
	private Object lockA = new Object();
	private Object lockB = new Object();
	public void methodA(){
		Thread t = Thread.currentThread();
		synchronized(lockA){//synchronized��ִ�е������ʱ��Ҫ����lockA��û����
			System.out.println(t.getName()+":����lockA����,����ʼ����A����");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+":��ʼ����B����");
			methodB();//t1�߳���ִ�и÷�������ô��methodB�����У�t1�߳�Ҫ��B�������м���,t1-t2����ͬʱ
		}
		System.out.println(t.getName()+":�ͷ�lockA����������A�������");
	}
	public void methodB(){
		Thread t = Thread.currentThread();
		synchronized(lockB){//synchronized��ִ�е������ʱ��Ҫ����lockB��û����
			System.out.println(t.getName()+":����lockB����,����ʼ����B����");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+":��ʼ����A����");
			methodA();//t2�߳���ִ�и÷�������ô��methodA�����У�t2�߳�Ҫ��A�������м���,t1-t2����ͬʱ
		}
		System.out.println(t.getName()+":�ͷ�lockB����������B�������");
	}
}