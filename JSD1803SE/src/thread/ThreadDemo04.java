package thread;
/**
 * 获取线程相关信息的一组方法
 * @author Administrator
 *
 */
public class ThreadDemo04 {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		//获取线程名字
		String name = main.getName();
		System.out.println(name);
		
		//获取唯一标识
		long id = main.getId();
		System.out.println(id);
		
		//获取线程的优先级
		
		int priority = main.getPriority();
		
		//线程是否活着
		boolean islive = main.isAlive();
		
		//是否是守护线程
		boolean isDaemon = main.isDaemon();
		
		//线程是否被中断了  true说明是被动终端   false说明是正常死亡
		boolean isIntertuped = main.isInterrupted();
		
		main.interrupt();//强制终止线程,好像没啥用
		
		System.out.println(isIntertuped);
	}

}
