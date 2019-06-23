package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 */
public class Collection_sortDemo21 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("tom");
		list.add("jerry");
		list.add("jack");
		list.add("rose");
		list.add("hanmeimei");
		list.add("lilei");
		list.add("bill");
		list.add("Ada");
		list.add("fox");
		//×Ö·û´®Ä¬ÈÏ°´unicode±àÂë
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
