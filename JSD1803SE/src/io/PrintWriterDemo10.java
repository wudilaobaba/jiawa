package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 11.
 * 缓冲字符流
 * java.io.BufferedWriter  就用PrintWriter代替它
 * java.io.BufferedReader
 * 内部有缓冲区，可以块读写字符。并且可以按行读写字符串。
 * 
 * java.io.PrintWriter  -> 高级流
 * 具有自动换行刷新的缓冲字符输出流，内部总是会连接BufferedWriter作为缓冲操作。
 * @author Administrator
 *
 */
public class PrintWriterDemo10 {
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/**
		 * PrintWriter提供了直接对文件写操作的构造方法
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 */
		//向pw.txt文件中写出字符串
		PrintWriter pw = new PrintWriter("./pw.txt","utf-8");
		pw.println("今天天气不错，挺分和日历的");
		pw.println("今天天气不错，挺分和日历的");
		pw.println('!');
		pw.close();
	}

}
