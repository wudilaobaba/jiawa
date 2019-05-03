package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * �����������ר�Ŷ�д�ļ����ݡ������ָ����ж�д
 * ����������ָ�뵱ǰλ�ö���д�ֽ�
 * RAF�����ִ���ģʽ��
 * "r":ֻ��ģʽ
 * "rw":��дģʽ
 * @author Administrator
 *
 */
public class RandomAccessFileDemo {//�������쳣

	public static void main(String[] args) throws IOException {
		/**
		 * RAF���õĹ��췽����
		 * RandomAccessFile(String path,String mode);
		 * RandomAccessFile(File file,String mode);
		 * mode:����ģʽ��ֻ�� �� ��д
		 */
		//RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		//��
		File file = new File("./raf.dat");
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		//"rw"ģʽ��-->��raf.dat�ļ������ھͻ��Զ�����
		//"r"ģʽ��-->�����쳣
		
		//***д�Ļ�ֻ��д�����ƣ�����������������������������
		//�ı�-->�Ƚ��ı�תΪ������
		//mp3-->�Ƚ�mp3תΪ������
		//ͼƬ-->�Ƚ�ͼƬתΪ������
		
		/**
		 * void write(int d)  --->ֻдһ���ֽ�  ����������Ϊint��char���ͣ� ���ն�תΪ�����ƺ�ȡ�Ͱ�λ��д��
		 * д��һ���ֽڣ���������intֵ��Ӧ�Ķ����Ƶ�"�Ͱ�λ"д���ļ�
		 * 
		 * 00000000 00000000 00000000 00000001
		 *                              �Ͱ�λ
		 * ÿ�����ж��Ǵ�ͷд��������׷������                      
		 */
		//raf.write(1);//�൱�����ļ���д�� 00000001  ��ʱд��ֻ�ǵ�����2���ƣ��������ַ�1
		//raf.write(65534);//����ת2���ƺ�ȡ�Ͱ�λ
		raf.write('��');//����ת2���ƺ�ȡ�Ͱ�λ      �ַ����Ķ����� //1110011 10001011   �Ͱ�λ�Լ���Ϊ139
		raf.write(66);//����ת2���ƺ�ȡ�Ͱ�λ
		raf.write(29579);//�ַ�'��'�ı��� ��Ӧ��������16λ     //����ת2���ƺ�ȡ�Ͱ�λ
		//�����ļ���Ϊ 00000001 00000001
		
		raf.write(-1);//�൱��д�� 11111111
		raf.write(256);//�൱��д�� 00000000
		System.out.println("д�����");
		raf.close();//ֻҪIO��������дraf.close(); ��Ȼ�����"��ǰ�ļ����ڱ�xxxʹ��"
		
		//���ü��±��򿪸ոյ��ļ�����ô���±���ʹ��unicode�ַ�����ÿ�������ƽ���ƥ�䣬ƥ�䵽unicode�ַ���תΪ�ַ����������"����"
		//��Ҫʲô���ü��±���
		System.out.println(Integer.toBinaryString('��'));//1110011 10001011   139
		
		/**
		 * һ��С���䣺
		 * ��� ��utf8���б��룬��д��6���ֽڣ���ʱ��������gbk���б��룬ֻ������6���е�ǰ4���ֽڣ����������ֽ�û�и��ǵ������Ծͱ���Ҫɾһ�²���
		 */
	}

}
