package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �û�ע�Ṧ��  ע����ַ������ף��涨���ֻ������32���ֽڣ����32���ֽڽ�������
 * �û���Ϣ�������û��� ���� �ǳ� ����
 * ����Ϊint������Ϊ�ַ���
 * ÿ���û�����Ϣ��Ҫд���ļ�user.dat�б���
 * ÿ����¼�ĳ��ȹ̶�Ϊ100�ֽڣ������û��������룬�ǳ������ռ32�ֽڣ�����intΪ4�ֽ�
 * �ַ���"����"�����������޸����ݣ�����Ӱ�������ļ��ĸ�ʽ
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("��ӭע��");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������û�����");
		String name = scan.nextLine();
		
		System.out.println("���������룺");
		String pwd = scan.nextLine();
		
		System.out.println("�������ǳƣ�");
		String nick = scan.nextLine();
		
		System.out.println("���������䣺");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("name:"+name);
		System.out.println("pwd:"+pwd);
		System.out.println("nick:"+nick);
		System.out.println("age:"+age);
		
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		raf.seek(raf.length());//ÿ�ζ���ָ��ĩβ��ʼд
		//д�û���
		byte [] data = Arrays.copyOf(name.getBytes("utf-8"), 32);
		raf.write(data);
		//д����
		data = Arrays.copyOf(pwd.getBytes("utf-8"), 32);
		raf.write(data);
		//д�ǳ�
		data = Arrays.copyOf(nick.getBytes("utf-8"), 32);
		raf.write(data);
		//д����
		raf.writeInt(age);
		System.out.println("ע�����,��ʱ�ļ�������100�ֽ�");
		raf.close();
	}

}
