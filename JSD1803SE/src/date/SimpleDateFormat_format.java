package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * SDF���Ը��ݸ��������ڸ�ʽ���ַ�����Date֮���໥ת��
 * @author Administrator
 *
 */
public class SimpleDateFormat_format {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		/**
		 * 2018-05-25 10:23:55
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
		/**
		 * String fromat(Date date)
		 * ��������Date���յ�ǰSDFָ�������ڸ�ʽת��Ϊ��Ӧ���ݵ��ַ���
		 */
		String time = sdf.format(date);
		System.out.println(time);
		
	}

}
