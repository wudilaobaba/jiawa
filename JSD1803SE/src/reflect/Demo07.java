package reflect;

import java.lang.reflect.Method;
/**
 * 反射可以调用一个类的私有成员
 * @author Administrator
 *
 */
public class Demo07 {

	public static void main(String[] args) throws Exception {
//		Person02 p = new Person02();
//		p.dosome(); 无法调用私有方法dosome，编译错误，私有方法不可见
		Class cls = Class.forName("reflect.Person02");
		Object obj = cls.newInstance();
		Method m = cls.getDeclaredMethod("dosome", null);
		m.setAccessible(true); //设置私有方法对外可用，不建议这样干
		System.out.println("已获取私有方法dosome");
		m.invoke(obj, null);
	}

}
