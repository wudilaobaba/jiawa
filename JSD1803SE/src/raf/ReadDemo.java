package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡһ���ֽ�
 * @author Administrator
 *
 */
public class ReadDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","r"); ///ֻ������
		int d = raf.read();//�����Σ�Ĭ��ֻ��һ���ֽڣ�����ֵΪ�������Ǹ��ֽڵĶ�����תΪʮ���ƺ������(��ֵ���Ϊ255)
		//��Ϊдһ���ֽڵ�ʱ��ֻд���˵Ͱ�λ���������Ϊ11111111  ����ʱ��תΪint���ͣ�������255
		//������ֵΪ-1�����ʾ�������ļ���ĩβ
		
		d = raf.read();//�ٶ�һ���ֽ�
		d = raf.read();//�ٶ�һ���ֽ�
		d = raf.read();//�ٶ�һ���ֽ�  -1��������255
		//d = raf.read();//�ٶ�һ���ֽ�   -1
		
		System.out.println(d);
		raf.close();
		
		
	}

}
