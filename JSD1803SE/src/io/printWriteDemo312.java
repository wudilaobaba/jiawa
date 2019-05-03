package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 使用流连接的形式创建PrintWriter，完成记事本功能
 * 将控制台输入的每一行字符串写入文件note.txt中
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
			pw.println(str);//会自动刷新
			pw.print(str);//不会自动刷新
			//pw.flush();//强制刷新，不建议
			//PrintWriter有自动行刷新功能，前提是PrintWriter的第一个参数必须是一个流,第二个参数是true就可以实现自动刷新，不需要flush
			//PrintWriter的第一个参数如果是文件，那么就没有第二个参数了
		}
		pw.close();
	}
}
