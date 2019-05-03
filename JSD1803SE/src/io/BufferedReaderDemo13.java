package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ������������԰��ж�ȡ�ַ���
 * @author Administrator
 *
 */
public class BufferedReaderDemo13 {
	public static void main(String[] args) throws IOException {
		/**
		 * ����ǰԴ�����ȡ���������������̨������null��־�Ŷ������ļ�ĩβ
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
