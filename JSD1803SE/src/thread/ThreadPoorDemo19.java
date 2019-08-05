package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要有两个作用：
 * 1.控制线程数量
 * 	 每个线程都会占用进程的一部分内存，线程数量过多，会导致资源消耗大，由于所有线程都是并发运行，那么过多的线程也会导致CPU过度切换，导致并发效率变差。
 * 2.重用线程
 *   频繁的创建销毁线程会给线程调度带来负担，所以也应当重用线程
 * @author Administrator
 *
 */
public class ThreadPoorDemo19 {
	/*
	 * 懒汉模式
	 * 饿汉模式
	 */
	//固定大小线程池,类似于公交车总站，线程运行完了再回来继续执行即将要执行的线程任务
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);//懒汉模式,来个任务才会来一个线程
		for(int i=0;i<5;i++){
			Runnable r = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					try{
						System.out.println(t.getName()+":正在运行任务");
						Thread.sleep(5000);
						System.out.println(t.getName()+":正在运行完毕");
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			};
			//将任务指派给线程池
			System.out.println("将任务指派给线程池");
			threadPool.execute(r);
		}
		threadPool.shutdownNow();//让所有线程池中的线程立刻马上停掉
//		threadPool.shutdown(); //停止线程池的方法，只要手里活都干完就停止
	}

}
