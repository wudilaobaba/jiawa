package thread;
/**
 * ������
 * ��ʹ��synchronized��ס��β�ͬ�Ĵ���Ƭ�Σ�������Щͬ����ʹ�õ�ͬ��������������ͬһ��ʱ��
 * ��ô��Щ����Ƭ��֮����ǻ���ġ�����̲߳���ͬʱִ�����ǡ�Ҫ��һ���߳�ִ����һ�������Ժ���һ���߳���ִ����������Ƭ��
 * @author Administrator
 * ע��:����synchronized�ķ������߳���ִ�и÷�����ʱ�򣬾�Ҫ��עĳ�����Ƿ�������
 *     ��δ��synchronized���������ע�Ƿ��������ճ�ִ��
 *     ֻҪ���Ķ�����ͬ���ͻụ��
 */
public class SyncDemo16 {
	public static void main(String[] args) {
		Boo boo = new Boo();
		Thread t1 = new Thread(){
			public void run(){
				boo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				boo.methodB();
			}
		};
		t1.start();
		t2.start();
	}

}
class Boo{
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
	public synchronized void methodB(){
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