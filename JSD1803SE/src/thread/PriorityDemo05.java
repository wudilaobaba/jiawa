package thread;
/**
 * 线程优先级
 * 线程之所以能得以并发运行，是靠线程调度的工作，线程调度会分配CPU运行时间片给某个线程，使得其可以运行。
 * 线程不能主动获取CPU时间。
 * 调整线程的优先级可以最大程度的改善某个线程获取CPU时间片的次数，理论上线程优先级越高的线程获取CPU时间片的次数越多。
 * 线程的优先级由数字1-10表示。1是最低优先级，10为最高优先级，5为默认值。
 * 也就是说：三个线程干同样的活，理论上谁的优先级高谁就最先完成 --- 唯一调整线程时间片的唯一方式
 * @author Administrator
 *
 */
public class PriorityDemo05 {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("MAX");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("MIN");
				}
			}
		};
		Thread normal = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("NORMAL");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
//		normal.setPriority(Thread.NORM_PRIORITY);
		
		min.start();
		normal.start();
		max.start();
	}

}
