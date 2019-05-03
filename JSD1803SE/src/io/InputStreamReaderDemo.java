package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 09.
 * 转换流
 * InputStreamReader,可以读取字符
 * @author Administrator
 *
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		//int d = isr.read();//返回的是一个char类型的int值,返回-1表示读到了文件末尾
		int f = -1;
		char[] data = new char[30];
		while((f=isr.read(data))!=-1){//read中可以一次读取一个char数组,返回值为实际读到的字符个数
			String str = new String(data,0,f);
			System.out.print(str);
			//System.out.print((char)f);
		}
		
		isr.close();
	}
	

}
