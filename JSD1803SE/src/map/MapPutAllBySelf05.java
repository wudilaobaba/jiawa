package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPutAllBySelf05 {

	public static void main(String[] args) {
		//����map�е�keyΪString��valueΪList��List�е�Ԫ��ΪString
		Map<String,List<String>>map = new HashMap<>();
		List<String> list = new ArrayList<String>();
		list.add("Top");
		list.add("middle");
		list.add("bottom");
		map.put("position",list);
		System.out.println(map);
		//һ�㶼��������������Map�з�List,  Js�о���Map�з�Set
		
		Map<String,String> map1 = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		map1.put("a", "a");
		map2.put("b", "b");
		map1.putAll(map2);
		System.out.println(map1);

	}
//	public void putAll(Map map){
//		for(String f:this){
//			System.out.println(f);
//		}
//		
//	}

}
