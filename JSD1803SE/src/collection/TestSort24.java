package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 练习：
 * 向一个List集合中添加10个100以内的随机数，然后按照从大到小的顺序排序集合。
 * @author Administrator
 *
 */
public class TestSort24 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			int num = (int)(Math.random()*(0 - (100+1)) + (100+1));
			list.add(num);
		}
		Collections.sort(list,new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				//返回值先按照参数的顺序做减法，则为由"小"到"大"的顺序
				return -(a-b);//若a-b小于0；就是按照a小的在前面，也就是按照从小到大排序
			}
		});
		System.out.println(list);
	}
}
