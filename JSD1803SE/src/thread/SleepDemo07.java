package thread;
/**
 * 打断睡眠阻塞
 * @author Administrator
 *
 */
public class SleepDemo07 {
	public static void main(String[] args) {
		Thread lin = new Thread(){
			public void run(){
				System.out.println("林：刚美完容，睡一会吧");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("林：干嘛呢！干嘛呢！干嘛呢！都破了相了！");
				}
				System.out.println("林：被你们吵醒了！！！！！！！");
			}
		};
		lin.start();
		
		Thread huang = new Thread(){
			public void run(){
				System.out.println("黄：开始砸墙！");
				for(int i=0;i<5;i++){
					System.out.println("黄：80！");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("咣当！");
				System.out.println("黄：搞定");
				
				//中断线程lin 此时该lin线程正处于睡眠状态，
				//中断睡眠后lin线程继续往下运行
				//若lin未睡眠，那么执行线面的中断方法，就直接在原点停下了
				lin.interrupt();//拍脸中断
			}
		};
		huang.start();
	}

}
