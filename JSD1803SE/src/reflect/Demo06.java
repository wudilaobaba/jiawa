package reflect;

import java.lang.reflect.Method;

/**
 * ���ú��в����ķ���
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		Class cls = Class.forName("reflect.Person02");
		Object obj = cls.newInstance();
		Method m = cls.getDeclaredMethod("sayHello", new Class[]{String.class,int.class});
		m.invoke(obj, new Object[]{"��",12});
	}

}
