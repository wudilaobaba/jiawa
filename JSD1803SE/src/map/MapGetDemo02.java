package map;

import java.util.HashMap;
import java.util.Map;

public class MapGetDemo02 {

	public static void main(String[] args) {
		/*
		 * 测试map的查询方法
		 */
		Map<String,String> map = new HashMap<>();
		map.put("u1", "Tom");
		map.put("u2", "Jerry");
		map.put("u3", "Mike");
		//从map中检索
		String v1 = map.get("u1");
		String v2 = map.get("u2");
		String v4 = map.get("u4");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v4);
	}

}
