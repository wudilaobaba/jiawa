package reflect;
/**
 * java�������  �����ڼ���������Լ����ʵ��
 * ��������������Ƕ�һ����ļ��أ�ʵ���������÷����������Դӱ����ڸ�Ϊ�������ڽ��С����������˴�������ȡ�
 * ���������ڽ��з�����������Ķ������Դ�����ܡ�����Ҫ�ʶ�ʹ��
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//JVM���Ȼ����Person.class�ļ�
//		Person02 p = new Person02();
		
		//�ڶ��ּ�����ķ�ʽ
		try {
			Class c = Class.forName("reflect.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/**
		 * JVM����һ���������¼��ַ�ʽ��
		 * 1.ִ�д���ʱ��������Ҫ�õ�ĳ����ʱ
		 * 	�磺Person p = new Person()
		 *  ��ʱ��JVM�����Person.class
		 *  
		 * 2.ͨ����������еģ�
		 * 	Class.forName(String className)�������ַ�������ʽ��֪JVM����ָ������
		 * 	�˷���ֻ��Ѱ�һ������������õ���·����ָ������
		 * 
		 * 3.ͨ���������ClassLoader������ָ�����࣬����������Զ���ָ������������û��ָ������·����
		 * 	������Ѱ��ָ��������м��ء�
		 * 
		 * ����һ�ַ�ʽ�⣬ʣ�����ֶ��ǻ��ڷ�����ƶ�̬����һ����
		 * 
		 *
		 */
		
		
	}
}
