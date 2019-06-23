package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ��ϰ��
 * ��һ��List���������10��100���ڵ��������Ȼ���մӴ�С��˳�����򼯺ϡ�
 * @author Administrator
 *
 */
public class TestSort24 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			int num = (int)(Math.random()*(0 - (100+1)) + (100+1));
			list.add(num);
		}
		Collections.sort(list,new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				//����ֵ�Ȱ��ղ�����˳������������Ϊ��"С"��"��"��˳��
				return -(a-b);//��a-bС��0�����ǰ���aС����ǰ�棬Ҳ���ǰ��մ�С��������
			}
		});
		System.out.println(list);
	}
}
