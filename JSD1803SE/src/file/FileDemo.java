package file;

import java.io.File;

/**
 * java.io.file
 * File��ÿһ��ʵ���������ڱ�ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * ʹ��File���ԣ�
 * 1�������ļ���Ŀ¼������(���֡���С���޸�ʱ���)
 * 2�������ļ���Ŀ¼(������ɾ��)
 * 3������һ��Ŀ¼������
 * ���ǲ��ܶ�д�ļ�����
 * @author Administrator
 *
 */
public class FileDemo {
	//���·������������ƽ̨������ʹ�����·��
	public static void main(String[] args) {
		File file = new File("./Demo.txt");//��������һ��·��   ��eclipse��./���ǵ�ǰ����������Ŀ��·��--->D:\workspace\JSD1803SE
		String name = file.getName();
		System.out.println(name);
		//��ȡ��С(�ֽ���)
		long len = file.length();
		System.out.println(len);
		boolean cr = file.canRead();//�ɶ�
		System.out.println(cr);
		boolean cw = file.canWrite();//��д���������е�ֻ����ѡ�ϾͲ���д�ˣ�
		System.out.println(cw);
		boolean ih = file.isHidden();//�Ƿ��������ļ�
		System.out.println(ih);
	}

}
