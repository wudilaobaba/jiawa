package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡ�Ӽ�
 * @author Administrator
 *
 */
public class ListDemo16 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		
		/*
		 * Lost subList(int s,int e);
		 */
		//��ȡ3~7
		List<Integer> subList = list.subList(3, 8); //��ͷ����β
		System.out.println(subList);
		System.out.println("---------------------");
		
		//���Ӽ���ÿ��Ԫ������10��,���Ӽ����������Ƕ�ԭ���ϲ���******
		for(int i=0;i<subList.size();i++){
			subList.set(i,subList.get(i)*10);
		}
		System.out.println(list);
		System.out.println("---------------------");
		
		//ɾ��2����8
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}
