package date;

import java.util.Date;

public class DateDemo {
	/**
	 * Date��ÿһ��ʵ�����ڱ�ʾһ��ȷ�е�ʱ�䡣�ڲ�ά��һ��longֵ����ֵΪ1970��1��1��00:00:00����ǰDate����ʾ��ʱ��֮���������ĺ��롣
	 * ����Date���ʱ����ʱ�����⣬���Դ󲿷ֲ���ʱ��ķ�����������Ϊ��ʱ�ģ����ٽ���ʹ�á�
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime(); //��ȡ��ǰʱ���
		date.setTime(time);
		date.setTime(0);
		System.out.println(time+1000*60*60*24);
		System.out.println(date);
		
	}

}

