package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �����Լ������գ�Ȼ�󾭹����㣬���������Ϊֹһ�����˶�����
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		String str = "1990-3-24";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		System.out.println("���Ѿ�����"+(new Date().getTime()-date.getTime())/1000/60/60/24+"����");
		
		//����10000��ļ�����������
		
		long d = date.getTime()+20000L*24*60*60*1000;
		Date t = new Date(d);
		String f = sdf.format(t);
		System.out.println(f);
	}

}
