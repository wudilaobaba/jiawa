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
public class SyncDemo11 {
	public static void main(String[] args) {
		Table table = new Table();
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

class Table{
	//一个桌子上有20个豆子
	private int beans = 20;   //注意01.当beans等于1的时候：
	public int getBean(){
		if(beans == 0){
			throw new RuntimeException("没有豆子了");
		}//注意02.t1线程执行到这后让出cpu时间，此时t2开始调用table.getBean()方法(接"注意01")
		Thread.yield();//让cpu让出时间，***但不一定会切换线程，有可能下一次还是把时间片段给t1 ,所以就不会100%正常执行也不会100%非正常执行  模拟线程切换
		//注意04.还有一种情况就是：若两个线程同时在这一行执行，那么beans就会减两次，也会出现打印很多负值的现象
		return beans--; //注意03.t2执行到这的时候beans返回了0,此时接着在43行t1未完成的部分，此时t1返回了-1(接"注意02")
	}
}