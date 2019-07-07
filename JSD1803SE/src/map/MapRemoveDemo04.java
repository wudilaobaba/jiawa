package map;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveDemo04 {

	public static void main(String[] args) {
		/*
		 * ��ʾMap�ķ���  map�������򣡣���
		 * size()������Ԫ�ص�����
		 * isEmpty()��⼯���Ƿ�Ϊ��
		 * remove()ɾ�������е�Ԫ��
		 * clear()���Map���ϵ�����
		 * containsKey(key) ���map�������Ƿ����ָ����key,����true/false
		 * equals(map) ���������ϵļ�ֵ����ȫ��ͬ���򷵻�true
		 * putAll(map) �������ϵĺϲ�
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
		map.put(null,"null"); //map��������һ��keyΪnull,һ�㲻��
		System.out.println(map);
		System.out.println(map.containsKey(null));
	}

}
