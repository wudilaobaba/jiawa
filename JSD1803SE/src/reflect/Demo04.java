package reflect;

import java.util.Scanner;

/**
 * ���ԣ�������ͬ�������������������ʵ��������ʵ��
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������"); //����java.util.HashMap  ����
		String className = scan.nextLine();
		/*
		 * Class.formName(String className)
		 * ���Դ������ֻҪ����·���µ��඼���Ե�
		 * ���磬���ǵ�ǰ��Ŀ��src��������е����Լ�API��java�ṩ����
		 * java.util.HashMap
		 * java.util.ArrayList
		 * reflect.Emp03
		 * reflect.Person02
		 */
		Class cls = Class.forName(className);
		Object obj = cls.newInstance();
		System.out.println(obj);
	}
}
