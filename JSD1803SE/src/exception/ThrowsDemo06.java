package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 派生类在继承超类时会重写其方法，那么在重写超类方法中含有throws声明异常抛出的方法时，
 * 对throws的重写规则
 * @author Administrator
 *
 */
public class ThrowsDemo06 {
	public void dosome() throws IOException,AWTException{
		
	}
}

//子类重写时，01.可以不抛异常，02.或只抛部分异常，03.或抛出父类异常的子类型
class Son extends ThrowsDemo06{
	public void dosome() throws FileNotFoundException{ //抛出父类异常的子类型
		
	}
}