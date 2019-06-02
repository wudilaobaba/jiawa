package thread;
/**
 * 互斥锁
 * 只要锁的对象相同，线程就会互斥
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
	//这种，方法上的锁锁住的是调用该方法的对象
	public synchronized void methodA(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正在运行A方法");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+":运行A方法完毕");
	}
	//这种，方法上的锁锁住的是调用该方法的对象
	public void methodB(){
		synchronized(this){
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在运行B方法");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+":运行B方法完毕");
		}
		
	}
}