package thread;
/**
 * 静态方法若使用synchroinzed修饰后，那么该方法一定具有同步效果。
 * @author Administrator
 *
 */
public class SyncDemo15 {
	public static void main(String[] args) {
		Xoo x1 = new Xoo();
		Xoo x2 = new Xoo();
		Thread t1 = new Thread(){
			public void run(){
				x1.dosome(); //非常不建议使用对象来调用静态方法
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				x2.dosome(); //非常不建议使用对象来调用静态方法
			}
		};
		t1.start();
		t2.start();
	}

}

class Xoo{
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正执行dosome方法");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+":运行dosome方法");
	}
}