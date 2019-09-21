package date;

import java.util.Calendar;

/**
 * Calender�ṩ��һ������
 * int get(int field)
 * �÷������Ի�ȡָ����ʱ���������Ӧ��ֵ
 * ʱ�������һ��intֵ����ֵͬ��ʾ��ͬʱ����������������Щ�������Ƕ��٣�
 * Calendar�ṩ�˶�Ӧ�ĳ���
 * @author Administrator
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//��ȡ�꣺
		int year = calendar.get(Calendar.YEAR);
		//��ȡ�£�
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * ��ȡ��
		 * DAY_OF_MONTH ����
		 * DAY_OF_WEEK  ���ڼ�
		 * DAY_OF_YEAR  һ���еĵڼ���
		*/
		int day = calendar.get(Calendar.DAY_OF_MONTH);  //DATE�൱��DAY_OF_MONTH
		System.out.println(year+"-"+month+"-"+day); //�´�0��ʼ
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		//�����ܹ�������
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("���ܹ���"+days+"��");
		
	}

}
