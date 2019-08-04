package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ���÷�����Ƶ���ĳ����ʵ���ķ���
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ҫʵ����������");
		String className = scan.nextLine();
		System.out.println("Ҫ���õķ�����");
		String methodName = scan.nextLine();
		
		/*
		 * Class�ṩ�˻�ȡ���ʾ���������Ϣ��һ�鷽�������У�
		 * Method getDeclaredMethod(String name,Class[] args)�ǻ�ȡ��ǰClass����ʾ���ඨ���ָ�������Լ������б�ķ���
		 * Method�Ƿ���API��һ����Ҫ����
		 * ��ÿһ��ʵ�����ڱ�ʾĳ�����һ�����巽��
		 * ͨ��Method���Ի�ȡ�����ʾ�ķ����������Ϣ���磺������������ֵ���͡��������͡��������η���
		 * ����Ҳ����ͨ��Method��̬�������ʾ�ķ���
		 * 
		 * getMethods();  //��ȡ��������з����������̳еķ���
		 * getDeclaredMethods(); //�����ǻ�ȡ�������Լ���������з���
		 * 
		 * 
		 * 
		 */
		
		//1.ʵ����
		Class cls = Class.forName(className);//"reflect.Person02"
		Object obj = cls.newInstance();
		//��ȡPerson��sayHello����
		Method[] y = cls.getDeclaredMethods();//��ȡ�����е����з���,��Method��������
		//2.���øö���ķ���
		Method m = cls.getDeclaredMethod(methodName, null);//��ȡ����һ���������޲η�����  //"sayHello"
		/*
		 * Method��invoke�������������õ�ǰMethod����ʾ�ķ���
		 * ����1.���ڳ�Ա��������������ô����Method����ʾ�ķ���ʱҪ����÷�����������
		 * ����2.ʵ�Σ����÷����޲Σ�����null����
		 */
		m.invoke(obj, null);//���÷���,���õ���obj��sayHi����,�ڶ���������ʵ��
		
	}
}
