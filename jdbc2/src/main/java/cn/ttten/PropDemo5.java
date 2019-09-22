package cn.ttten;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropDemo5 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		//�õ��ļ���������
		InputStream ips = PropDemo5.class.getClassLoader().getResourceAsStream("jdbc.properties");
		//���ļ�������prop
		prop.load(ips);
		//��ȡ���������
		String age = prop.getProperty("age");
		String name = prop.getProperty("name");
		System.out.println(age+" "+name);
		
		//��ϰ�����������ݿ���ĸ���Ϣ�ŵ������ļ���
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}
}
