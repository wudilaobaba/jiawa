package thread;
/**
 * 当多个线程并发操作统一资源时就形成了“抢”的局面，由于线程切换不确定，
 * 可能会导致线程操作该资源时未按照程序预定的执行顺序执行代码，导致逻辑出现混乱。
 * 严重时可能导致系统瘫痪。
 * 多条线程的时间片段分配的不一致就会造成打印出大量的负数
 * 以下程序报错是正常的，但是如果打印出大量的负数，就会产生上面的描述
 * @author Administrator
 *
 */
public class SyncDemo12 {
	public static void main(String[] args) {
		Table1 table = new Table1();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//让cpu让出时间，主动切换线程，模拟线程切换
					System.out.println(getName()+":"+bean); //线程中获取自己线程的名字
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//让cpu让出时间，主动切换线程，模拟线程切换
					System.out.println(getName()+":"+bean); //线程中获取自己线程的名字
				}
			}
		};
		t1.start();
		t2.start();
	}
}

class Table1{
	//方法前面加关键字synchronized修饰，可以在一个时刻只让一个线程去在该方法内执行，起到了"按序执行"的作用，解决了"抢"的问题
	//一个桌子上有20个豆子
	private int beans = 20;   //注意01.当beans等于1的时候：
	/*
	 * 当一个方法被synchronized修饰后，那么该方法称为同步方法，即：多个线程不能同时在方法内部执行，从而解决了并发安全问题。
	 * 若此时有一个线程t1正在运行该方法，那么其他线程执行该方法的时候，在t1执行该方法的过程中，其他线程会暂时阻塞
	 * 在以下方法上使用synchronized，那么同步监视器对象就是当前方法所属对象，即：方法内部看到的this
	 * 若是静态方法加了synchronized，那么天然的具有同步效果！！！
	 * //这种，方法上的锁锁住的是调用该方法的对象
	 */
	public synchronized int getBean(){
		if(beans == 0){
			throw new RuntimeException("没有豆子了");
		}//注意02.t1线程执行到这后让出cpu时间，此时t2开始调用table.getBean()方法(接"注意01")
		Thread.yield();//让cpu让出时间，***但不一定会切换线程，有可能下一次还是把时间片段给t1 ,所以就不会100%正常执行也不会100%非正常执行  模拟线程切换
		//注意04.还有一种情况就是：若两个线程同时在这一行执行，那么beans就会减两次，也会出现打印很多负值的现象
		return beans--; //注意03.t2执行到这的时候beans返回了0,此时接着在43行t1未完成的部分，此时t1返回了-1(接"注意02")
	}
}