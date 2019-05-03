package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 04.
 * ������-->��һ�Ը߼���
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * �����ֽ�����������������ӿ��дЧ�ʵ�,�ײ���һ�ζ�8KB
 * @author Administrator
 *
 */
public class Copy204 {
	/**
	 * ʹ�û�������ɸ��Ʋ���
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./a.exe");
		BufferedInputStream bis = new BufferedInputStream(fis);//�߼������ڵͼ���fis��
		FileOutputStream fos = new FileOutputStream("./b.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int y = -1;
		long s = System.currentTimeMillis();
		while((y=bis.read())!=-1){ //����д��ʱ��ʹ�ø߼������ж�д
			bos.write(y);
		}
		bis.close();
		bos.close();
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}

}
