package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 09.
 * ת����
 * InputStreamReader,���Զ�ȡ�ַ�
 * @author Administrator
 *
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		//int d = isr.read();//���ص���һ��char���͵�intֵ,����-1��ʾ�������ļ�ĩβ
		int f = -1;
		char[] data = new char[30];
		while((f=isr.read(data))!=-1){//read�п���һ�ζ�ȡһ��char����,����ֵΪʵ�ʶ������ַ�����
			String str = new String(data,0,f);
			System.out.print(str);
			//System.out.print((char)f);
		}
		
		isr.close();
	}
	

}
