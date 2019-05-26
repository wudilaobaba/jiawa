package thread;
/**
 * 线程提供了一个静态方法:
 * static Thread currentThread()
 * 该方法可以获取运行该方法的线程
 * @author Administrator
 *
 */
public class CurrentThread04 {
	public static void main(String[] args) {
//		Thread t1 = new Thread(new Runnable(){
//			public void run(){
//				for(int i=0;i<1000;i++){
//					System.out.println("你是谁？");
//				}
//			}
//		});
//		t1.start();
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程是："+main);
		//[main,         5,             main]
		 //线程名                  线程优先级                           线程组  
		//java中变量与字符串进行拼接，默认调用对象的toString方法
		dosome();
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread(); //运行run方法的线程是25行的t,所以该行的t就是25行的t
				System.out.println("--->"+t);
				dosome();  //调用dosome方法的线程是25行的t
			}
		};
		t.start();
	}
	
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("运行dosome方法的线程是："+t);
	}

}
