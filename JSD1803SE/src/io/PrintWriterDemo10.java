package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 11.
 * �����ַ���
 * java.io.BufferedWriter  ����PrintWriter������
 * java.io.BufferedReader
 * �ڲ��л����������Կ��д�ַ������ҿ��԰��ж�д�ַ�����
 * 
 * java.io.PrintWriter  -> �߼���
 * �����Զ�����ˢ�µĻ����ַ���������ڲ����ǻ�����BufferedWriter��Ϊ���������
 * @author Administrator
 *
 */
public class PrintWriterDemo10 {
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/**
		 * PrintWriter�ṩ��ֱ�Ӷ��ļ�д�����Ĺ��췽��
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 */
		//��pw.txt�ļ���д���ַ���
		PrintWriter pw = new PrintWriter("./pw.txt","utf-8");
		pw.println("������������ͦ�ֺ�������");
		pw.println("������������ͦ�ֺ�������");
		pw.println('!');
		pw.close();
	}

}
