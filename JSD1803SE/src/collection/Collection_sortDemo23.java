package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections�ṩ��һ�����ص�sort������
 * static void sort(List list, Comparator c)
 * �÷���Ҫ����һ���Ƚ�����Ȼ����ݱȽ����ȽϵĽ���Լ���Ԫ�ؽ�����Ȼ����
 * ���ڸ÷���Ҫ����һ������ıȽϹ���(�Ƚ���),���Ը÷�������Ҫ��Ԫ�ر���ʵ��Comparable�ӿڣ��Ӷ���Ԫ��û�������ԡ�
 * ��������ʹ�øñȽϹ������򼯺ϣ�����Ҳ�Ͳ�����ҪԪ������ıȽϹ�����ôԪ������ȽϹ�����������Ҫ�������Ҳ���Խ����
 * @author Administrator
 *
 */
public class Collection_sortDemo23 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("С����ʦ");
		list.add("����ʦ");
		//Collections.sort(list,new MyComparator());
		//���������ڲ���
		Collections.sort(list,new Comparator<String>(){
			public int compare(String o1, String o2){
				//�ַ��������ַ����ٱȴ�С
				return o1.length() - o2.length();
			}
		});
		System.out.println(list);
	}

}

class MyComparator implements Comparator<String>{
	public int compare(String o1, String o2){
		//�ַ��������ַ����ٱȴ�С
		return o1.length() - o2.length();
	}
}
