package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntrySetDemo07 {
	public static void main(String[] args) {
		/*
		 * ����EntrySet��Map���Ͻ��б���
		 */
		Map<String,String> map = new HashMap<>();
		map.put("content-type", "application/json; charset=utf-8");
		map.put("date", "Sun, 07 Jul 2019 03:40:10 GMT");
		map.put("server", "Tengine");
		map.put("status", "status");
		map.put("referer", "https://www.cnblogs.com/");
		System.out.println(map);
		//����ȫ��������ͷ
		//mapû���ṩֱ�ӱ����ķ�����
		//��������entrySet �� keySet���ʵ�ֱ���
		//Entry����ʹ���map�еļ�ֵ��
		//һ��Enrey��������������ԣ�һ����key��һ����value,Entry��ʵ������HashMap�ڲ���
		Set<Entry<String,String>> set = map.entrySet();
		         //key    value
		//set�а���map��ȫ���ļ�ֵ��
		//ֻҪ����set,���൱�ڱ�����map
		for(Entry<String,String> e: set){
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
}
