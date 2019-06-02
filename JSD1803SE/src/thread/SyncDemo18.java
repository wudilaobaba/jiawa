package thread;
/**
 * 死锁现象
 * 当多个线程都持有自己的锁，但是都等对方先释放锁时，就会出现"僵持"情况，使得所有线程进入阻塞状态。
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
		synchronized(lockA){//synchronized，执行到这里的时候要看看lockA有没有锁
			System.out.println(t.getName()+":持有lockA的锁,并开始运行A方法");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+":开始运行B方法");
			methodB();//t1线程来执行该方法，那么看methodB方法中，t1线程要对B方法进行加锁,t1-t2几乎同时
		}
		System.out.println(t.getName()+":释放lockA的锁并运行A方法完毕");
	}
	public void methodB(){
		Thread t = Thread.currentThread();
		synchronized(lockB){//synchronized，执行到这里的时候要看看lockB有没有锁
			System.out.println(t.getName()+":持有lockB的锁,并开始运行B方法");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName()+":开始运行A方法");
			methodA();//t2线程来执行该方法，那么看methodA方法中，t2线程要对A方法进行加锁,t1-t2几乎同时
		}
		System.out.println(t.getName()+":释放lockB的锁并运行B方法完毕");
	}
}