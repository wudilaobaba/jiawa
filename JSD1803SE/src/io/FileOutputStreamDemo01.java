package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 01
 * java��׼io����  Input��Output���������
 * �����չ��ܷ�Ϊ��д;���շ����Ϊ���룬�����
 * ������Ĳ�����Ϊ����д�ĳ���
 * ������������ȡ����
 * ���������д������
 * 
 * java.io.InputStream�������ֽ��������ĸ��࣬�涨��������������Ӧ���߱��Ķ�ȡ�����ֽڵ���ط���
 * java.io.OutputStream�������ֽ�������ĸ���
 * java������Ϊ�������ࣺ�ڵ����ʹ�����
 * 
 * �ڵ������ֳ�Ϊ�ͼ�������ʵ�����ӳ�������һ�˵�"�ܵ�",����ʵ�ʰ������ݡ���дһ���ǽ����ڵͼ����Ļ���֮�Ͻ��еġ�
 * ���������ֳƸ߼��������ܶ�������(û����),�߼���һ�����������������ϣ�������"����"����ʱ������мӹ�����,�����Ƕ����ݶ�дʱ��ĳЩ������
 * �ļ�������һ�Եͼ���,���ڶ�д�ļ����ݡ�������RAFһ�������ǵײ�Ķ�д��ʽ��ͬ������˳���д�ġ���RAF�ǻ���ָ�������д�ġ�(��û��seek,RAF��Seek)
 * 
 * java�е�io��˳���д(��ˮ����)����RandomAccessFile�������д(ֻ�������ļ�)
 * @author Administrator
 * 
 * 81128100197817
 * gxbsdf11
 */
public class FileOutputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		/**
		 * ���ļ�fos.txt��д���ַ���
		 */
		File file = new File("./fos.txt");
		FileOutputStream fos = new FileOutputStream(file);
		//FileOutputStream fos = new FileOutputStream("./fos.txt");     //����true�Ǹ�������
		//FileOutputStream fos = new FileOutputStream("./fos.txt",true);//��true��׷������
		//fos.write(1); //write������֮ǰ��ѧ��RandomAccessFile��һ����
		String str = "��һ�ú��ݺ��ݺ��ݺ��ݣ����Ʈҡ";//�����ַ����ı����ִ��һ�εĻ����Ƚ�ԭ������ȫĨ����д�������RandomAccessFile��ͬ
		fos.write(str.getBytes("utf-8"));
		System.out.println("д�����");
		fos.close();
		
		//��ֻ���������㣺1.Ĩ������д��2.׷������
		//�޷���RandomAccessFile�޸����밸���������м����
	}

}
