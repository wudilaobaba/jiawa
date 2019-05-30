package thread;
/**
 * join方法可以协调线程之间的同步运行
 * join方法会让运行该方法的线程处于阻塞状态，直到该方法所属线程运行完毕才会解除阻塞
 * @author Administrator
 * 先下载好图片在显示图片，不能并行
 */
public class JoinDemo09 {
	//图片是否下载完毕
	private static boolean isFinish = false;
	public static void main(String[] args) {
		Thread down = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片...");
				for(int i=0;i<100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("下载完毕");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:开始显示图片");
				
				//先等待down线程将图片下完再加载   等待down线程执行完再执行自己
				try {
					down.join(); //将自己阻塞，先执行down线程再执行自己
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(!isFinish){
					throw new RuntimeException("图片加载失败");
				}
				System.out.println("show:图片显示了");
			}
		};
		down.start();
		show.start();
	}
}

