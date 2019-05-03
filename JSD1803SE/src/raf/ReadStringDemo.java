package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ַ���
 * @author Administrator
 *
 */
public class ReadStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.txt","r");
		//��һ���ַ������ַ������ģ���utf-8ʱ�Ƕ�3���ֽڣ���gbkʱ�������ֽ�   ����Ӣ������һ���ֽڣ�������
		byte[] data = new byte[(int)raf.length()];//length() ����./raf.txt�ļ������ֽ���Ϊlong��
		raf.read(data);
		
		//�ֽ�����תΪ�ַ���
		//String str = new String(data); //ʹ��ϵͳĬ�ϵ��ַ���
		String str = new String(data,"utf-8"); //ʹ��ָ�����ַ���          ����Լ���ã�����utf-8д������utf-8��
		System.out.println(str);
		raf.close();
		/**
		 * '��'
		 * utf-8��2���ƣ�  unicodeΪ33539 ��Ӧ�Ķ�����Ϊ1000 0011 0000 0011
		 * �������ֽ����Ϊ��
		 * 11101000
		 * 10001100
		 * 10000011
		 * 
		 * utf-8����ʱ�������һ���ֽ��ǵ�ǰ��λ�ǣ�
		 * 1110 ���ַ�����3���ֽڱ�ʾ��     �����ÿ���ֽڶ�����10��ͷ��
		 * 1100        2
		 * 1111        4
		 * 
		 * �� 1110xxxx 10xxxxxx 10xxxxxx   x�ĵط�������Чλ����'��'����Чλ���������1000 0011 0000 0011��������Ķ�����һ��
		 * 
		 * ���ԣ�utf-8���ǽ��ַ���unicode�Ķ����ƽ��в�֣�1110����ǰ��λ 10���Ž�������6λ��10��������6λ������utf-8�ı������
		 * 
		 */
	}

}
