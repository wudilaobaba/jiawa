package thread;
/**
 * 线程有两种创建方式
 * 1.继承Thread并重写run方法，在run方法中定义线程要执行的任务(弊端就是只能单继承，继承了Thread就无法继承超类了)
 * 2.单独定义线程任务，实现Runnable接口并重写run方法
 * @author Administrator
 * *********************** 必须是Thread类型的对象才可以调用start方法  **************
 */
public class ThreadDemo02 {
	public static void main(String[] args) {
		//实例化线程任务
		Runnable r1= new MyRunnable1();
		Runnable r2= new MyRunnable2();
		//创建线程872310
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//以下两个start中的run几乎同时运行
		t1.start(); //t1的start调用完后，不一定会马上运行里面的start。然后t2.start马上运行
		t2.start();
	}

}


class MyRunnable1 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("你是谁？");
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("查水表");
		}
	}
}