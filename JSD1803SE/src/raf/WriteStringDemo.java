package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * д���ַ�������
 * String�ṩ�ķ���  byte[] getBytes()//����ϵͳĬ�ϵ��ַ������� ����ǰϵͳĬ�ϵ���GBK��
 * byte[] getBytes(String �ַ�������)//����ǰ�ַ�������ָ���ַ���ת����һ���ֽ�(�Ƽ������������˿�ƽ̨���ֵ���������)
 * @author Administrator
 * ���������ַ�����
 * GBK:������� ����ռ2���ֽ�
 * UTF-8:����룬��unicode���б��룬�䳤�ı��뼯��Ӣ��1�ֽڣ�����3�ֽ�
 * ISO8859-1:ŷ�ޱ��뼯����֧������	
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * ��д./ ���ǵ�ǰĿ¼��
		 */
		RandomAccessFile raf = new RandomAccessFile("./raf.txt","rw");
		String str = "�����ٿ���һ�飬���ϵ���";
		byte[] data = str.getBytes("gbk");//���ַ���ת��һ���ֽ�
		System.out.println(data.length);//24���ֽ�
		raf.write(data);
		raf.write("��İ�".getBytes("utf-8"));
		System.out.println("д�����");
		raf.close();
	}

}
