package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 在流连接中使用PrintWriter,自己实现PrintWriter
 * @author Administrator
 *
 */
public class PrintWriterDemo211 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		FileOutputStream fos = new FileOutputStream("./pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("随便写了");
		pw.println("随便写了");
		pw.close();
	}

}
