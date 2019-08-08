package first;


import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {
	public static void main(String[] args) {
		//启动spring容器   ApplicationContext是一个接口
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		System.out.println(ac);
		//获取对象
		Student stu = (Student)ac.getBean("stu1",Student.class); //默认是Object类型
		System.out.println(stu);
		Date date = (Date)ac.getBean("date1",Date.class);
		System.out.println(date);
		
		
		Calendar cal1 = ac.getBean("cal1",Calendar.class);
		System.out.println(cal1);
		
		
		Date time1 = ac.getBean("time1",Date.class);
		System.out.println(time1);
	}

}
