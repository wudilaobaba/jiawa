package thread;
/**
 * 互斥锁
 * 当使用synchronized锁住多段不同的代码片段，但是这些同步块使用的同步监视器对象是同一个时，
 * 那么这些代码片段之间就是互斥的。多个线程不能同时执行他们。要等一个线程执行完一个方法以后，另一个线程再执行其他代码片段
 * @author Administrator
 * 注意:加了synchronized的方法，线程在执行该方法的时候，就要关注某对象是否上锁；
 *     若未加synchronized，则无需关注是否上锁，照常执行
 *     只要锁的对象相同，就会互斥
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
	public synchronized void methodB(){
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