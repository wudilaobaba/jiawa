package io;
/**
 * 02
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo02 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./fos.txt");
		byte[] b = new byte[200];
		int len = fis.read(b);
		String str = new String(b,0,len,"utf-8");//0~len֮�����ת�ַ���
		System.out.println(str);
	}

}
