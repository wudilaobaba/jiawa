package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 05.
 * ���������д����ʱ�Ļ���������
 * @author Administrator
 *
 */
public class BufferedOutPutStream_flush05 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("./bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String line = "ҹ������������";
		byte[] data = line.getBytes("utf-8");
		bos.write(data);
		//д��ʱ������װ��8kb���ǲ��Ὣ����д��ȥ�ģ���Ҫǿ��д��ȥ����bos.flush();װ����������(8k)�ǲ����Զ�ȥ��ש��
		//bos.flush();//��������ʱ�ԣ��ͽ������flush
		bos.close();//close�����Դ���flush����
		System.out.println("д�����");
	}

}
