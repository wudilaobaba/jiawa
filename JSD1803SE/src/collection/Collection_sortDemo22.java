package collection;
/**
 * ʹ��Collections.sort(List)����ʱ�����һЩ����֮��
 * 1.�÷���Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿڣ�����ʵ�ʿ������ǲ�̫��ȡ�ģ���Ϊ�ù��ܻ������д�Ĵ����������ԡ�
 * 	 ��ν��������ָ�������ǵ���ĳ������ʱ���ù���Ҫ������Ϊ���޸Ĵ��룬�޸ĵĵط�Խ�࣬������Խ�ߣ������ڳ������չ�����ά����
 * 2.��Ԫ���Ѿ�ʵ����Comparable�ӿڲ������˱ȽϹ��򣬵��Ǹù���������������Ҫ��ʱ���÷������޷�ʹ�á�
 * 	 ���������ַ�����ֻ�ܰ����ַ�unicode����������������ʱ��ûʲô���塣
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_sortDemo22 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("С����ʦ");
		//�ַ���Ĭ�ϰ�unicode����
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
