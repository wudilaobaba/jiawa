package date;

import java.util.Calendar;

/**
 * Calender提供了一个方法
 * int get(int field)
 * 该方法可以获取指定的时间分量所对应的值
 * 时间分量是一个int值，不同值表示不同时间分量，无需记忆这些数具体是多少，
 * Calendar提供了对应的常量
 * @author Administrator
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//获取年：
		int year = calendar.get(Calendar.YEAR);
		//获取月：
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * 获取日
		 * DAY_OF_MONTH 几号
		 * DAY_OF_WEEK  星期几
		 * DAY_OF_YEAR  一年中的第几天
		*/
		int day = calendar.get(Calendar.DAY_OF_MONTH);  //DATE相当于DAY_OF_MONTH
		System.out.println(year+"-"+month+"-"+day); //月从0开始
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		//今年总共多少天
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("年总共天"+days+"天");
		
	}

}
