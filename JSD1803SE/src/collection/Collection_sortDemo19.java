package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的工具类
 * 集合的工具类：java.util.Collections
 * 提供了很多静态方法，便于操作集合
 * @author Administrator
 *
 */
public class Collection_sortDemo19 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		Collections.sort(list);
		System.out.println("顺序："+list);
		Collections.shuffle(list);
		System.out.println("乱序："+list);
	}
}
