package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 08.
 * ���������������ڽ��ж������л�����(��ԭΪ�����Ķ���)
 * ��Ҫע�⣬��������ȡ���ֽڱ������ɶ����������һ���������л�����ֽڣ�������з����л�ʱ���׳��쳣
 * @author Administrator
 *
 */
public class ObjectInputStreamDemo08 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("./person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person)ois.readObject();
		//ois.readObject();��Object����
		System.out.println(p);
		ois.close();
	}

}
