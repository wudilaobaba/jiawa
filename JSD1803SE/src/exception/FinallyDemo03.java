package exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * JDK1.7以后，可以用以下简便写法来进行IO异常的处理
 * 新特性:自动关闭
 * @author Administrator
 *
 */

public class FinallyDemo03 {
	//最终编译器还是会将以下代码转为FinallyDemo02中的样子
	public static void main(String[] args) {
		try(
			//只用实现了AutoCloseable接口的可以定义在这里
			FileInputStream fis = new FileInputStream("./fos.txt");
		){
			int d = fis.read();
			System.out.println(d);
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
