package thread;
/**
 * ��̬������ʹ��synchroinzed���κ���ô�÷���һ������ͬ��Ч����
 * @author Administrator
 *
 */
public class SyncDemo15 {
	public static void main(String[] args) {
		Xoo x1 = new Xoo();
		Xoo x2 = new Xoo();
		Thread t1 = new Thread(){
			public void run(){
				x1.dosome(); //�ǳ�������ʹ�ö��������þ�̬����
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				x2.dosome(); //�ǳ�������ʹ�ö��������þ�̬����
			}
		};
		t1.start();
		t2.start();
	}

}

class Xoo{
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":��ִ��dosome����");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+":����dosome����");
	}
}