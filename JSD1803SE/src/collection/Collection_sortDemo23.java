package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections提供了一个重载的sort方法：
 * static void sort(List list, Comparator c)
 * 该方法要求传入一个比较器，然后根据比较器比较的结果对集合元素进行自然排序。
 * 由于该方法要求传入一个额外的比较规则(比较器),所以该方法不再要求元素必须实现Comparable接口，从而对元素没有侵入性。
 * 并且由于使用该比较规则排序集合，所以也就不再需要元素自身的比较规则，那么元素自身比较规则不满足排序要求的问题也得以解决。
 * @author Administrator
 *
 */
public class Collection_sortDemo23 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("传奇");
		list.add("小泽老师");
		list.add("苍老师");
		//Collections.sort(list,new MyComparator());
		//或用匿名内部类
		Collections.sort(list,new Comparator<String>(){
			public int compare(String o1, String o2){
				//字符串按照字符多少比大小
				return o1.length() - o2.length();
			}
		});
		System.out.println(list);
	}

}

class MyComparator implements Comparator<String>{
	public int compare(String o1, String o2){
		//字符串按照字符多少比大小
		return o1.length() - o2.length();
	}
}
