package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapTestDemo03 {

	public static void main(String[] args) {
		//����Ƚ�map�Ĳ�ѯ����(���ұȽ�)
//		compareSelf(1000);
//		compareSelf(10000);
//		compareSelf(100000);
		
		
		//������List���бȽ�
		compareWithList(10000);
	}
	
	public static void compareSelf (int times){
		Map<Integer,String> map = new HashMap<>();
		for(int i=0;i<times;i++){
			map.put(i, "n"+i);
		}
		long start = System.nanoTime(); //����ϵͳ��������1ms = 1000000ns
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
		//01.ArrayList��indexOf�����������±꣬��ͷ��ʼ��
		//list.indexOf("n"+(times-1)); 
		//02.LinkedList��ѯͷβ��죬��ѯ�м�����, ƫ��ͷ����ͷ�ң�ƫ��β����β��
		listLink.get(times/2); 
		//03.ArrayList��get�������Ǻܿ�ģ���HashMap��get���ܲ��
		long end1 = System.nanoTime();
		System.out.println(end1-start1);
		
		long start2 = System.nanoTime();
		map.get(times-1);
		long end2 = System.nanoTime();
		System.out.println(end2-start2);
	}

}
