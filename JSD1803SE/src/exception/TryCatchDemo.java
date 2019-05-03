package exception;
/**
 * 01.
 * java异常处理中的try-catch
 * 语法：
 * try{
 * 	代码片段
 * }catch(XXXException e){
 * 	捕获try代码片段中出现的XXXException后的处理手段
 * }
 * @author Administrator
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		String str = null;
		/*
		 *当JVM执行代码时遇到异常时，会实例化该异常的一个实例，然后设置好代码执行的过程，并将该异常抛出 
		 *如果抛出异常的代码所在方法没有处理异常的能力，异常会抛到当前方法之外，由调用当前方法的代码片段去处理
		 */
		System.err.println(str.length());//空指针异常
		//在main方法中出现的异常，那么谁调用main方谁负责处理异常，
		//此时是虚拟机在调用main方法，那么既然没进行异常处理，那么就直接将程序杀掉，下面的代码就不执行了，比如闪退
		System.out.println("程序结束了");
	}
}
