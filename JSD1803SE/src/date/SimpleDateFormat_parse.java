package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��һ���ַ������ն�Ӧ�����ڸ�ʽ����ΪDate
 * @author Administrator
 *
 */
public class SimpleDateFormat_parse {

	public static void main(String[] args) throws ParseException {
		
		String str = "2019-05-09 12:45:55";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		System.out.println(date);
	}

}
