package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �г�����ע���û���Ϣ
 * @author Administrator
 *
 */
public class Demo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./user.dat","r");
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(i*100);//�����ǳƺ����䣬�ͼ��ϴʾ䣬��ɾ��������ǳƺ�����Ĵ���
			//���û�����
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"utf-8").trim();
			//�����룺
			data = new byte[32];
			raf.read(data);
			String pwd = new String(data,"utf-8").trim();
			//���ǳƣ�
			data = new byte[32];
			raf.read(data);
			String nick = new String(data,"utf-8").trim();
			//�����䣺
			int age = raf.readInt();
			
			String str = name + "," + pwd + "," + nick + "," + age;
			System.out.println(str);
			System.out.println("��ǰָ��λ�ã�"+raf.getFilePointer());
		}
		raf.close();
	}

}
