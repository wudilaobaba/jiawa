package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar ������
 * Calendar��һ�������ࡣ�涨�˲������ڵ���ط���
 * ���ڲ�ͬ���������������ڵļ��㲻ͬ����Ҫ����ͬ������ȥʵ����Щ����
 * ���õ�ʵ���ࣺjava.util.GregorianCalendar��������
 * Calendar�ṩ��һ����̬������getInstance()���Ի�ȡһ����ǰϵͳ���ڵ������õ�ʵ���࣬
 * �󲿷ֻ�ȡ�Ķ�������ʵ����
 * @author Administrator
 *
 */
public class CalendarDemo1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date date = calendar.getTime(); //Calendar��getTime����������Date����ʽ����
		System.out.println(date);
		
		/*
		 * Ҳ�ṩ��һ��������Calendar��ʾָ�����ڵķ����� setTime(Date date);
		 */
		
	}

}
