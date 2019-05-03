package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * ���ÿ�ζ�д��������������ʵ�ʶ�д������������߶�дЧ��
 * ����Ӳ��(����)���ԣ���дЧ����ȱ�㡣����Ӳ�̿��дЧ�ʻ��ǿ��Ա�֤�ġ�
 * �����д�����ֽڶ�д         //��еӲ��Ч�ʲ�
 * ���д��һ��һ���ֽڶ�д //��еӲ��Ч�ʻ�����
 * �������ֶ�д���ڹ�̬Ӳ����Ч�ʲ�𲻴�
 * @author Administrator
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		/**
		 * ���Ƶ�ǰĿ¼�е�xx.xx�ļ�
		 */
		RandomAccessFile src = new RandomAccessFile("./xx.xx","r");
		RandomAccessFile desc = new RandomAccessFile("./xx_cp.xx","rw");
		
		long start = System.currentTimeMillis();
		/**
		 * int read(byte[] data)  //һ���Զ�data����ֽ����飻����ֵΪһ����ȡ�˶��ٸ��ֽ�   ����ֵΪ-1���ʾ�������ļ�ĩβ
		 * һ���Զ�ȡ�����ֽ����鳤�ȵ��ֽ����������뵽�������У�����ֵΪʵ�ʶ�ȡ�����ֽ���
		 * ���ļ�ֻ��30kb ������д����һ�ζ�100kb����ôʵ�ʶ������ֽ�������30kb
		 * 
		 * 1 byte = 8λ������
		 * 1 kb = 1024 byte
		 * 1 mb = 1024 kb
		 * 1 gb = 1024 mb
		 * 1 tb = 1024 gb
		 */
		/**
		 * void write(byte[] data) //һ���Խ��������ֽ������������ֽ�д��
		 * void write(byte[] data,int index,int len) //�������ֽ�������±�index����ʼ������len���ֽ�һ����д��
		 */
		int len = -1;
		byte[] buf = new byte[1024 * 10]; //����һ���Զ�8~10kb
		while((len=src.read(buf))!=-1){
			System.out.println(len);
			desc.write(buf,0,len);//����  ���������ֽ�����д���ļ�   �Ӹ��ֽ�buf����ĵ�0����ʼд��һ��дlen��
		}
		
		long end = System.currentTimeMillis();
		System.out.println("�������,��ʱ��"+(end-start)+"ms");
		src.close();
		desc.close();
	}

}
