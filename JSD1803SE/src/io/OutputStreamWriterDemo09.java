package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 09.
 * java�������ն�д��λ����Ϊ�ֽ������ַ���
 * �ַ�������д��λ�����ַ�Ϊ��λ�������ַ�����д������һ���ľ����ԣ�ֻ�����ڶ�д�ı����ݡ����ı����ݲ���ʹ���ַ�����ȡ
 * ����ͼƬ�������������ݡ�MP3�����ݣ�
 * @author Administrator
 *	Reader�������ַ��������ĸ���
 *	Writer�������ַ�������ĸ���
 *
 *ת������ֻ�ܶ�д�ı�����
 *java.io.InputStreamReader
 *java.io.OutputStreamWriter
 *������һ�Ը߼�����ͬʱҲ�ǳ��õ��ַ���ʵ���ࡣ
 *�ڶ�д�ı�����ʱ��ʹ�ø߼����������������Ƿǳ���Ҫ��һ�����𵽳������µ����á�
 *��Ϊ�������е��ַ�����ֻ�������������ַ����ϣ��������ϵͼ��������ֽ���������ת�������������ֽ�����
 *�����������������ַ����������𵽽��ַ������ֽ���"�Խ�"�����á�
 *	
 */
public class OutputStreamWriterDemo09 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");//��utf-8�ַ������б��룬����Ĳ������Բ�д
		osw.write("�ļ������ķ���");
		osw.write('��');
		osw.close();
	}

}
