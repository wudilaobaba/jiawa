package reflect;

import java.lang.reflect.Method;
/**
 * ������Ե���һ�����˽�г�Ա
 * @author Administrator
 *
 */
public class Demo07 {

	public static void main(String[] args) throws Exception {
//		Person02 p = new Person02();
//		p.dosome(); �޷�����˽�з���dosome���������˽�з������ɼ�
		Class cls = Class.forName("reflect.Person02");
		Object obj = cls.newInstance();
		Method m = cls.getDeclaredMethod("dosome", null);
		m.setAccessible(true); //����˽�з���������ã�������������
		System.out.println("�ѻ�ȡ˽�з���dosome");
		m.invoke(obj, null);
	}

}
