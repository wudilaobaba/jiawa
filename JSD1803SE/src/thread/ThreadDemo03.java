package thread;
/**
 * 使用匿名内部类完成两种线程创建方式
 * @author Administrator
 * *********************** 必须是Thread类型的对象才可以调用start方法  **************
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		//第一种创建线程:
//		Thread t1 = new Thread(){
//			public void start(){
//				for(int i=0;i<1000;i++){
//					System.out.println("你是谁？");
//				}
//			}
//		};
//		t1.start();
//		Thread t2 = new Thread(){
//			public void start(){
//				for(int i=0;i<1000;i++){
//					System.out.println("我是查水表的...");
//				}
//			}
//		};
//		t2.start();
		
// ================================================================		
		
		//第二种创建线程
//		Thread t1 = new Thread((Runnable)new Mtwo01(){});
//		Thread t2 = new Thread((Runnable)new Mtwo02(){});
//		t1.start();
//		t2.start();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁？");
				}
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是查水表的");
				}
			}
		});
		t1.start();
		t2.start();
		
		
		//测试匿名内部类
		Test t = new Test(){
			public void x(){
				System.out.println("YYY"); //重写超类方法
			}
		};
		t.x(); // "YYY"
	}
}

class Test {
	public void x(){
		System.out.println("XXX");
	}
}
