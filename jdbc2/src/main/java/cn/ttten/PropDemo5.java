package cn.ttten;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropDemo5 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		//得到文件的输入流
		InputStream ips = PropDemo5.class.getClassLoader().getResourceAsStream("jdbc.properties");
		//把文件流交给prop
		prop.load(ips);
		//获取保存的数据
		String age = prop.getProperty("age");
		String name = prop.getProperty("name");
		System.out.println(age+" "+name);
		
		//练习：把连接数据库的四个信息放到配置文件中
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}
}
