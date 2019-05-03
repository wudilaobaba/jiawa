package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 07 ������
 * ��������һ�Ը߼��������Է������Ƕ�дjava�е��κζ���
 * ��������������Խ�ָ���Ķ���ת��Ϊһ���ֽں�д��
 * ���������������Խ�һ���ֽڻ�ԭΪ��Ӧ�Ķ���ǰ���������ֽ�Ӧ���Ƕ����������һ������ת�����ֽ�
 * @author Administrator
 *
 */
public class ObjectOutputStreamDemo07 {

	public static void main(String[] args) throws IOException {
		
		String name = "";
		int age = 18;
		String gender = "Ů";
		String[] otherInfo = {
			"��һ����Ա",
			"����дë����",
			"�ٽ������Ļ�����",
			"������ʦ"
		};
		Person p = new Person(name,age,gender,otherInfo); //new�����Ķ������ڴ���(�ϵ��û��)
		System.out.println(p);
		/**
		 * ����Person����д�뵽person.obj��
		 */
		FileOutputStream fos = new FileOutputStream("./person.obj");
		BufferedOutputStream bos = new BufferedOutputStream(fos);//Ϊ����߻���Ч��
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		/**
		 * �������ʵ�����������£�
		 * 01.p�����������������������������������ö���ת��Ϊ��һ���ֽڣ�������̳�Ϊ�������л�
		 * 02.ת���������ֽ��������ļ��������Ȼ��д�����ļ�����(д�����)��������д����������ñ���Ĺ��̳�Ϊ���ݳ־û�
		 */
		oos.writeObject(p);
		System.out.println("д�����");
		oos.close();
	}

}
