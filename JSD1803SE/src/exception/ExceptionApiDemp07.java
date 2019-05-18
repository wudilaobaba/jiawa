package exception;
/**
 * 异常常用方法
 * @author Administrator
 *
 */
public class ExceptionApiDemp07 {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try{
			String str = "a";
			System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			//输出堆栈错误信息，有利于定位错误并解决
			e.printStackTrace();
			//获取错误消息
			String str = e.getMessage(); //若自己抛的异常throw new Exceotion("xx"),那么e.getMessage()返回的就是"xx"
			System.out.println(str);
		}
		System.out.println("程序结束了");
	}
}
