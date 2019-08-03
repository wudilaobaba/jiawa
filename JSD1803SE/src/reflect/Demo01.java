package reflect;

import io.Person;

/**
 * java�������  �����ڼ���������Լ����ʵ��
 * ��������������Ƕ�һ����ļ��أ�ʵ���������÷����������Դӱ����ڸ�Ϊ�������ڽ��С����������˴�������ȡ�
 * ���������ڽ��з�����������Ķ������Դ�����ܡ�����Ҫ�ʶ�ʹ��
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
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
		
		//JVM���Ȼ����Person.class�ļ�
		//ʵ�����Ĺ���
//		Person02 p = null;
//		p = new Person02();
		
		//�ڶ��ּ�����ķ�ʽ
		/*
		 * ������Ĺ��̾�����JVM��ȡ�����Ӧ��class�ļ�
		 * ��JVM��ȡһ�����class�ļ��󣬻�ʵ����һ��Class���ʵ�����ڱ�����ص���������Ϣ��
		 * ����ÿ����JVM���ص��඼����JVM�ڲ���һ��Class���ʵ�����б��档����ÿ��������ֻ��һ��Class���ʵ����֮��Ӧ��
		 * ClassҲ��Ϊ�����ÿ��ʵ�����ڱ�ʾJVM���ص�һ���࣬ͨ�������Ի�ȡ���ʾ����������Ϣ��
		 * ���磺������֣�����Щ���ԣ����������Լ����з���������ͨ��Class������ʵ�������ʾ���ࡣ
		 */
		try {
			Class c1 = Class.forName("reflect.Person02"); //����һ�������
			Class c2 = Person.class; //д����
			Class c3 = Class.forName("reflect.Emp03"); //����һ�������
			/*
			 * Class�ṩ��һ��������
			 * Object newInstance()
			 * �÷����ǵ��õ�ǰClass����ʾ������޲ι��췽��
			 * ʵ����һ������ʵ�������䷵�ء�ע�⣺����(Person)�������޲ι��췽���ſ���ʹ�����������
			 */
			Object obj = c1.newInstance(); //��������ʵ������Ҫ�׳��쳣��Ĭ�ϻ��һ��Person���޲ι��췽��������ֵΪObject���͵�Personʵ��
			System.out.println(obj);//reflect.Person02@15db9742
			
			Object objEmp = c3.newInstance();
			System.out.println(objEmp);//reflect.Emp03@6d06d69c
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
