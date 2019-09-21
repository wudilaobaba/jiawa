package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类
 * Calendar是一个抽象类。规定了操作日期的相关方法
 * 由于不同的日期历法对日期的计算不同，需要靠不同的子类去实现这些方法
 * 常用的实现类：java.util.GregorianCalendar，即阳历
 * Calendar提供了一个静态方法：getInstance()可以获取一个当前系统所在地区适用的实现类，
 * 大部分获取的都是阳历实现类
 * @author Administrator
 *
 */
public class CalendarDemo1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date date = calendar.getTime(); //Calendar的getTime方法可以以Date的形式返回
		System.out.println(date);
		
		/*
		 * 也提供了一个可以让Calendar表示指定日期的方法： setTime(Date date);
		 */
		
	}

}
