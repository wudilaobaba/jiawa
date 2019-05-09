package exception;
/**
 * 02.
 * finally块是异常捕获机制中的最后一块
 * finally可以直接跟在try后面或者最后一个catch之后
 * finally可以保证只要程序执行到try语句块中，无论try语句块的代码是否抛出异常，finally块中的代码都必定执行(try中有return时，finally中的代码也要执行)
 * 通常会将无论是否出现异常都要运行的代码放在finally中确保运行，比如IO操作中的关闭流
 * @author Administrator
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try{
			String str = "";
			System.out.println(str.length());
			return;
		}catch(Exception e){
			System.out.println("程序出错了");
		}finally{
			System.out.println("finall中的代码执行了");
		}
		System.out.println("程序结束了");
	}
}
