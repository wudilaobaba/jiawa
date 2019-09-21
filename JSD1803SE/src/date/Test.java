package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 输入自己的生日，然后经过计算，输出到今天为止一共活了多少天
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		String str = "1990-3-24";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		System.out.println("我已经活了"+(new Date().getTime()-date.getTime())/1000/60/60/24+"天了");
		
		//输出活到10000天的纪念日是哪天
		
		long d = date.getTime()+20000L*24*60*60*1000;
		Date t = new Date(d);
		String f = sdf.format(t);
		System.out.println(f);
	}

}
