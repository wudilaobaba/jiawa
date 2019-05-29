package thread;
/**
 * 守护线程
 * 守护线程又称为后台线程，一个线程创建出来默认都是普通(前台)线程，守护线程需要在线程启动前单独进行设置。
 * 使用上守护线程与普通线程无差别，但是在结束时机上有一点不同，即：当进程结束时，所有正在运行的守护线程都会被强制中断。
 * 程序结束：也就是进程结束：当一个进程中的所有前台线程都结束时，进程即结束(程序结束)，此时正在运行的守护线程才会被强制中断。
 * main是前台线程， main是最先结束的线程
 * @author Administrator
 *
 */
public class DaemonThreadDemo08 {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("Rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Rose:Aaaaaa!!!");
				System.out.println("噗通！");
			}
		};
		Thread batty = new Thread(){
			public void run(){
				for(int i=0;i<7;i++){
					System.out.println("Batty:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Rose:Aaaaaa!!!");
				System.out.println("噗通！");
			}
		};
		Thread jack = new Thread(){ //死循环也会结束
			public void run(){
				while(true){
					System.out.println("Jack:you jump, I jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		rose.start();
		batty.start();
		
		jack.setDaemon(true); //将某个线程设置为守护线程的方法，且必须在该线程的start之前进行设置
		jack.start();
		System.out.println("main线程结束了");
//		while(true){
//
//		}
//		此时若有while死循环，那么main线程还没有结束，所以守护线程jack就不会被强制中断
	}

}
