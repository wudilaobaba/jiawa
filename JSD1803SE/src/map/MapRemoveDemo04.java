package map;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveDemo04 {

	public static void main(String[] args) {
		/*
		 * 演示Map的方法  map集合无序！！！
		 * size()集合中元素的数量
		 * isEmpty()检测集合是否为空
		 * remove()删除集合中的元素
		 * clear()清空Map集合的内容
		 * containsKey(key) 检测map集合中是否包含指定的key,返回true/false
		 * equals(map) 若两个集合的键值对完全相同，则返回true
		 * putAll(map) 两个集合的合并
		 */
		Map<String,String> map = new HashMap<>();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.put("u1", "Tom");
		map.put("u2", "Bob");
		map.put("u3", "Mary");
		map.put("u4", "Jhon");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		String r = map.remove("u1");
		System.out.println(r);
		map.put(null,"null"); //map中允许有一个key为null,一般不用
		System.out.println(map);
		System.out.println(map.containsKey(null));
	}

}
