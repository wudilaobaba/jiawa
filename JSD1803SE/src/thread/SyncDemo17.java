package thread;
/**
 * ������
 * ֻҪ���Ķ�����ͬ���߳̾ͻụ��
 */
public class SyncDemo17 {
	public static void main(String[] args) {
		Coo coo = new Coo();
		Thread t1 = new Thread(){
			public void run(){
				coo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				coo.methodB();
			}
		};
		t1.start();
		t2.start();
	}

}
class Coo{
	//���֣������ϵ�����ס���ǵ��ø÷����Ķ���
	public synchronized void methodA(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":��������A����");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+":����A�������");
	}
	//���֣������ϵ�����ס���ǵ��ø÷����Ķ���
	public void methodB(){
		synchronized(this){
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":��������B����");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+":����B�������");
		}
		
	}
}