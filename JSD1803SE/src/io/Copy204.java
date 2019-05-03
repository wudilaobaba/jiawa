package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 04.
 * 缓冲流-->是一对高级流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 缓冲字节输入输出流是用来加快读写效率的,底层是一次读8KB
 * @author Administrator
 *
 */
public class Copy204 {
	/**
	 * 使用缓冲流完成复制操作
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./a.exe");
		BufferedInputStream bis = new BufferedInputStream(fis);//高级流套在低级流fis上
		FileOutputStream fos = new FileOutputStream("./b.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int y = -1;
		long s = System.currentTimeMillis();
		while((y=bis.read())!=-1){ //最后读写的时候使用高级流进行读写
			bos.write(y);
		}
		bis.close();
		bos.close();
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}

}
