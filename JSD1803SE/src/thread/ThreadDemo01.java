package thread;
/**
 * 线程能允许我们"同时"执行多段代码。
 * 线程有两种创建方式
 * 1.继承Thread并重写run方法，在run方法中定义线程要执行的任务(弊端就是只能单继承，继承了Thread就无法继承超类了)是匿名内部类的首选
 * 2.
 * 
 * 第一种创建方式的不足之处：
 * 1.由于java是单继承的，这就导致在实际开发中我们往往需要继承某个复用方法，而当前类又需要并发运行，
 * 导致不能同时又继承复用方法的类又继承线程
 * 2.定义线程的同时重写run方法定义任务，这就导致了线程和任务有一个必然的耦合关系。不利于线程的重用。
 * @author Administrator
 *
 */
public class ThreadDemo01 {
	public static void main(String[] args) {
		Thread t1 = new MtThread1(); //创建线程
		t1.start();//启动线程
		Thread t2 = new MtThread2();
		t2.start();
		/*
		 * 线程启动要条用start,而不是直接调用run方法
		 * start方法的作用将线程纳入线程调度中，线程调度会统一管理需要并发运行的多个线程，调度CPU,
		 * 分配时间片段给线程，得到时间片段的线程会被CPU运行这段时间，运行完毕后，
		 * 线程调度会再分配时间片段给一个线程使CPU运行该线程。
		 * 线程调度分配时间片段给每个线程并非有序的"一人一次",但是在整体过程中，
		 * 每个线程获取的CPU时间片段的次数是基本一致的。
		 * 线程调度不可控
		 */
	}
}
class MtThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁？");
		}
	}
}
class MtThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的");
		}
	}
}