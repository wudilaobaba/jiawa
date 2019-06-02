package thread;
/**
 * 有效的缩小同步范围可以在保证并发安全的前提下尽可能提高并发效率
 * 同步块可以更精准的控制需要同步运行的代码片段。
 * synchronized(同步监视器){
 * 	 需要同步运行的代码片段
 * }
 * 
 * 同步监视器是java中任意的一个对象，只要保证多个线程看到的该对象是"同一个",即可保证同步块中的代码是并发安全的。
 * @author Administrator
 *
 */
public class SyncDemo13 {
	public static void main(String[] args) {
		Shop shop = new Shop();
		G f = new G();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy(f);
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy(f);
			}
		};
		t1.start();
		t2.start();
	}
}

class G{} //测试synchronized块中的参数对象必须是所有线程一看见就是那个唯一的对象

class Shop{
	public void buy(G g){
		Thread t = Thread.currentThread();
		try{
			System.out.println(t.getName()+":正在挑衣服。。。");
			Thread.sleep(5000);
			
			//若t1线程执行到这里，那么其他线程执行到这里的时候就会暂时阻塞，等t1执行完synchronized块中的代码，其他线程再继续进行
			//***synchronized的参数选取规则:必须保证所有线程看到的那个参数对象是同一个
			//***synchronized给一个唯一的对象上锁，才可以保证多个线程发现该对象上锁了，就进行临时阻塞
			//***只要出现多个线程不阻塞的情况，那synchronized中的参数一定不是唯一的对象！！！！
			synchronized(this){ //建议该参数传this, 在这里this就是shop,只有shop对象来调用该方法
				System.out.println(t.getName()+":正在试衣服。。。");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+"正在结账");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}