package thread;
/**
 * sleep阻塞
 * 线程提供的方法：静态方法
 * static void sleep(long ms) 阻塞过程中CPU绕过该现程
 * 该方法可以让运行该方法的线程处于阻塞状态指定毫秒超时后线程会重新回到RUNNABLE状态，
 * 等待分配CPU时间片再次接着之前的执行状态继续运行。
 * @author Administrator
 *
 */
public class SleepDemo06 {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			/*
			 *通常会引起线程阻塞现象的方法都要求处理中断异常
			 *线程有一个方法:interrupt() -- 中断线程的阻塞状态
			 *该方法可以中断一个正在运行的线程。但是若该线程正处于某种阻塞时被调用中断方法中断，那么并不是将该线程直接中断，
			 *而是中断其阻塞状态。这时通常会抛出中断异常，通知该程序线程的阻塞状态被打断。 
			 */
			Thread.sleep(5000); //运行该sleep方法的线程是main线程，main线程执行这里后阻塞5000ms
		} catch (InterruptedException e) {//中断异常
			e.printStackTrace();
		}
		System.out.println("程序结束了");
	}

}
