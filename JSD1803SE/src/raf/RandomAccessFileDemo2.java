package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��д�����������ݣ��Լ�RAFָ��Ĳ���
 * @author Administrator
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		long pos = raf.getFilePointer();//��ȡ��ǰָ���λ��,λ�þ��ǵ�ǰָ���ڵڼ����ֽ��ϵĵ�һλ��
		System.out.println("��ǰָ���λ��:"+raf.getFilePointer());
		//���ļ���д��int���ֵ
		/**
		 * 01111111 11111111 11111111 11111111
		 * >>>24  �������������ƶ�24�γ�Ϊ����
		 * 00000000 00000000 00000000 01111111     11111111 11111111 11111111(�������������)
		 * 
		 * >>>24  �������������ƶ�16�γ�Ϊ����
		 * 00000000 00000000 01111111 11111111
		 * 
		 * >>>24  �������������ƶ�8�γ�Ϊ����
		 * 00000000 01111111 11111111 11111111
		 * 
		 * >>>24  �������������ƶ�0�γ�Ϊ����
		 * 01111111 11111111 11111111 11111111
		 */
		int max = Integer.MAX_VALUE;
		raf.write(max>>>24);
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max); //���һ�β����ƶ�
		System.out.println("��ǰָ���λ��:"+raf.getFilePointer());//4 Ҳ���ǵ����λ��
		
		/**
		 * һ���Խ�������intֵ��4�ֽ�ȫ��д��
		 */
		raf.writeInt(max);//дintֵ�ķ���
		
		raf.writeLong(123L);//дlongֵ�ķ���
		System.out.println("��ǰָ���λ��:"+raf.getFilePointer());
		
		System.out.println("д�����");
		
		
//		raf.seek(0);//��ָ���ƶ���λ��0 (���������Ǹ�������ΧΪ0~�ļ��ĳ���)
		int y = raf.read();//�ļ��Ĳ���Ĭ�϶�����ָ�뵱ǰλ�ý���
		System.out.println(y);
		
		raf.seek(0);
		int y1 = raf.readInt();
		//readInt��һ�ζ�4���ֽڣ������4���ֽ�תΪһ��intֵ
		//readLong��һ�ζ�8���ֽڣ������8���ֽ�תΪһ��longֵ
		//���ԣ�������ָ��Ļ��ᱨ��EOF  end of file �ļ�ĩβ  �����Ƿ���-1 
		System.out.println("��ǰָ���λ��:"+raf.getFilePointer());
		System.out.println(y1);
		
		raf.seek(8);
		long h = raf.readLong();
		System.out.println(h);
		
		raf.seek(0);
		long j = raf.readLong();//�൱�ڶ���8���ֽڣ����Ƕ�����ǰ����int�Ķ�����ƴ�Ӻ����
		System.out.println(j);
		
		
		raf.close();
		
		
		
		//����д�꣬�ļ��й�16���ֽ�  1��int��4���ֽ�    long��double����8���ֽ�
	}
}
