package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ��¼��֤
 * ����������Ҫ���û������û��������룬Ȼ��ƥ��user.dat�ļ��е��û������û���������������ȷ��ʾ����ɹ��������������ȷ
 * �����޸�����Ĺ���
 * @author Administrator
 *
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		byte b[] = new byte[32];
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("������");
		String name = scan.nextLine();
		System.out.println("���룺");
		String pwd = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(100*i);
			raf.read(b);
			String nameTest = new String(b,"utf-8").trim();
			raf.read(b);
			String pwdTest = new String(b,"utf-8").trim();
			if(name.equals(nameTest) && pwd.equals(pwdTest)){
				flag = true;
				raf.seek(100*i+32);
				break;
			}
		}
		
		if(flag){
			System.out.println("��ȷ,���޸���������");
			String rpwd = scan.nextLine();
			raf.write(Arrays.copyOf(rpwd.getBytes("utf-8"), 32));
			System.out.println("�����޸ĳɹ�");
		}else{
			System.out.println("����");
		}
		raf.close();
	}

}
