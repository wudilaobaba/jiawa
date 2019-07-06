package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapTestDemo03 {

	public static void main(String[] args) {
		//纵向比较map的查询性能(自我比较)
//		compareSelf(1000);
//		compareSelf(10000);
//		compareSelf(100000);
		
		
		//横向与List进行比较
		compareWithList(10000);
	}
	
	public static void compareSelf (int times){
		Map<Integer,String> map = new HashMap<>();
		for(int i=0;i<times;i++){
			map.put(i, "n"+i);
		}
		long start = System.nanoTime(); //返回系统纳秒数，1ms = 1000000ns
		String v = map.get(times-1);
		long end = System.nanoTime();
		System.out.println(end-start);
	}
	
	public static void compareWithList(int times){
		Map<Integer,String> map = new HashMap<>();
		List<String> list = new ArrayList<String>();
		List<String> listLink = new LinkedList<String>();
		for(int i=0;i<times;i++){
			map.put(i, "n"+i);
			list.add(i, "n"+i);
			listLink.add(i, "n"+i);
		}
		long start1 = System.nanoTime();
		//01.ArrayList的indexOf是用来检索下标，从头开始找
		//list.indexOf("n"+(times-1)); 
		//02.LinkedList查询头尾最快，查询中间最慢, 偏向头部从头找，偏向尾部从尾找
		listLink.get(times/2); 
		//03.ArrayList的get方法还是很快的，与HashMap的get性能差不多
		long end1 = System.nanoTime();
		System.out.println(end1-start1);
		
		long start2 = System.nanoTime();
		map.get(times-1);
		long end2 = System.nanoTime();
		System.out.println(end2-start2);
	}

}
