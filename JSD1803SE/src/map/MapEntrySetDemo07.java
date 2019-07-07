package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntrySetDemo07 {
	public static void main(String[] args) {
		/*
		 * 利用EntrySet对Map集合进行遍历
		 */
		Map<String,String> map = new HashMap<>();
		map.put("content-type", "application/json; charset=utf-8");
		map.put("date", "Sun, 07 Jul 2019 03:40:10 GMT");
		map.put("server", "Tengine");
		map.put("status", "status");
		map.put("referer", "https://www.cnblogs.com/");
		System.out.println(map);
		//遍历全部的请求头
		//map没有提供直接遍历的方法！
		//可以利用entrySet 和 keySet间接实现遍历
		//Entry对象就代表map中的键值对
		//一个Enrey对象包含两个属性，一个是key，一个是value,Entry的实现类是HashMap内部类
		Set<Entry<String,String>> set = map.entrySet();
		         //key    value
		//set中包含map中全部的键值对
		//只要遍历set,就相当于遍历了map
		for(Entry<String,String> e: set){
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
}
