package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集
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
		//获取3~7
		List<Integer> subList = list.subList(3, 8); //含头不含尾
		System.out.println(subList);
		System.out.println("---------------------");
		
		//将子集中每个元素扩大10倍,对子集操作，就是对原集合操作******
		for(int i=0;i<subList.size();i++){
			subList.set(i,subList.get(i)*10);
		}
		System.out.println(list);
		System.out.println("---------------------");
		
		//删除2——8
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}
