package map;

import java.util.HashMap;
import java.util.Map;

public class MapPutDemo01 {
	public static void main(String[] args) {
		/*
		 * ��������ӵ�map��
		 */
		Map map = new HashMap();
		Object obj = map.put("u1", "Tom");
		obj = map.put("u2", "Tom1");
		System.out.println(obj);
		System.out.println(map);
		
		
		/*
		 * ���÷��Ͷ������Ͱ�ȫ��map����
		 */
		Map<String,String> map2 = new HashMap<>();  //java8����ʡ��
		Map<String,String> map3 = new HashMap<String,String>(); //java6
		String s = map2.put("u1", "Tom");
		s = map2.put("u1", "Jerry");
		System.out.println(s);
		System.out.println(map2);
	}
}
