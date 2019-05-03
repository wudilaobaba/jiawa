package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流，可以按行读取字符串
 * @author Administrator
 *
 */
public class BufferedReaderDemo13 {
	public static void main(String[] args) throws IOException {
		/**
		 * 将当前源代码读取出来并输出到控制台，返回null标志着读到了文件末尾
		 */
		FileInputStream fis = new FileInputStream("./src/io/Person.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
