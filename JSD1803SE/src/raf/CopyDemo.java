package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ���ͨ�÷���,�����κθ�ʽ���ļ���  ȱ�㣺̫��ʱ��������Ż�
 * @author Administrator
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * ���Ƶ�ǰĿ¼�е�img.png�ļ�
		 */
		RandomAccessFile src = new RandomAccessFile("./img.png","r");
		RandomAccessFile desc = new RandomAccessFile("./img_cp.png","rw");
		int d = -1;//��¼ÿ�ζ�ȡ���ֽ�����
		while((d=src.read())!=-1){
			desc.write(d);
		}
		System.out.println("�������");
		src.close();
		desc.close();
	}

}
