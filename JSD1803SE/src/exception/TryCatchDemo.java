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
		try{
			String str = "a";
			/*
			 *当JVM执行代码时遇到异常时，会实例化该异常的一个实例，然后设置好代码执行的过程，并将该异常抛出
			 *如果抛出异常的代码所在方法没有处理异常的能力，异常会抛到当前方法之外，由调用当前方法的代码片段去处理
			 */
			System.out.println(str.length());//空指针异常
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			//在main方法中出现的异常，那么谁调用main方谁负责处理异常，
			//此时是虚拟机在调用main方法，那么既然没进行异常处理，那么就直接将程序杀掉，下面的代码就不执行了，比如闪退
			System.out.println("！！！！"); //上面若有异常，那么就直接进catch了，不会执行这一行
			//catch可以定义多个，可以分别捕获这些异常
		}catch(NullPointerException e){ //这里只捕获空指针异常
			System.out.println("出现了空指针");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界");
			//在最后使用一个Exception是一个好习惯，可以避免因异常导致程序中断
			//捕获顺序应当是子类型异常在上面先捕获，父类型异常在下后捕获
		}catch(Exception e){//若除了上述catch中的异常之外还有没考虑到的异常，那么就写下面的参数Exception e，若一旦有其他异常，就会直接捕获
			System.out.println("反正就是出了个错");
		}
		//Exception是所有异常的父类
		
		System.out.println("程序结束了");
	}
}
