package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * ����������ʹ��PrintWriter,�Լ�ʵ��PrintWriter
 * @author Administrator
 *
 */
public class PrintWriterDemo211 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		FileOutputStream fos = new FileOutputStream("./pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println("���д��");
		pw.println("���д��");
		pw.close();
	}

}
