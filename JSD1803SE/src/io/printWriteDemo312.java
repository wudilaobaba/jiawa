package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ʹ�������ӵ���ʽ����PrintWriter����ɼ��±�����
 * ������̨�����ÿһ���ַ���д���ļ�note.txt��
 * @author Administrator
 *
 */
public class printWriteDemo312 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter pw = new PrintWriter(
			new BufferedWriter(
				new OutputStreamWriter(
					new FileOutputStream("./note.txt"),"utf-8"
				)
			),true
		);
		Scanner scan = new Scanner(System.in);
		while(true){
			String str = scan.nextLine();
			if("exit".equals(str)){
				break;
			}
			pw.println(str);//���Զ�ˢ��
			pw.print(str);//�����Զ�ˢ��
			//pw.flush();//ǿ��ˢ�£�������
			//PrintWriter���Զ���ˢ�¹��ܣ�ǰ����PrintWriter�ĵ�һ������������һ����,�ڶ���������true�Ϳ���ʵ���Զ�ˢ�£�����Ҫflush
			//PrintWriter�ĵ�һ������������ļ�����ô��û�еڶ���������
		}
		pw.close();
	}
}
