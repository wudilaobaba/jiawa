package raf;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
/**
 * ��ϰ
 * ���һ�����׼��±�����
 * �����������û��ڿ���̨�����ÿһ���ַ�����д�뵽�ļ�note.txt�С����û�����exitʱ�������˳�
 * @author Administrator
 *
 */
public class NoteDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		RandomAccessFile file = new RandomAccessFile("./note.txt","rw");
		file.seek(file.length());
		String str;
		do{
			str = scan.next();
			if("exit".equals(str)){   //�ַ����Ƚϵ�ʱ��Ҫ �ַ���.equals(����) ��ֹ��ָ���쳣
				file.write("".getBytes());
			}else{
				byte[] s = str.getBytes("gbk");
				file.write(s);
			}
			
		}while(!str.equals("exit"));
		file.close();
		System.out.println("Bye");
	}

}
