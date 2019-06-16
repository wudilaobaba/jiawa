package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * ����Ĺ����ࣺArrays�ṩ��һ����̬����asList
 * �÷������Խ�����������ת��Ϊһ��List����
 * @author Administrator
 *
 */
public class ArrayToListDemo18 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		System.out.println(list.size());
		
		/*
		 * ������ת���ļ��Ͻ��в��������Ƕ�ԭ����Ĳ���,���ǲ����Խ�����ɾ��������Ϊ�ᵼ���������ݻ����ݣ�
		 * �������޷���ʾԭ�����ˣ�����
		 */
		list.set(1, "2");
//		list.add("five");//����
		array[0] = "555";//��ԭ�������ֱ�Ӳ�������ô��Ӧ��ת���ļ���Ҳ���ű�
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
		//��Ҫ������ɾ����newһ�����ϲ���ԭ���ϴ��뼴��
		/*
		 * ���м��϶�֧��һ������ΪCollection�Ĺ��췽�����������ڴ�����ǰ���ϵ�ͬʱ�������������е�����Ԫ��	
		 */
		List<String> list2 = new ArrayList<String>(list);
		list2.add("five");
		System.out.println(list);
	}
}
