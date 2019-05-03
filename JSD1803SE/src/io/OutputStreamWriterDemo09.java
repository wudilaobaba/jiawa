package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 09.
 * java将流按照读写单位划分为字节流和字符流
 * 字符流：读写单位是以字符为单位，所以字符流读写数据有一定的局限性，只能用于读写文本数据。非文本数据不能使用字符流读取
 * （如图片、基本类型数据、MP3等数据）
 * @author Administrator
 *	Reader是所有字符输入流的父类
 *	Writer是所有字符输出流的父类
 *
 *转换流：只能读写文本数据
 *java.io.InputStreamReader
 *java.io.OutputStreamWriter
 *他们是一对高级流，同时也是常用的字符流实现类。
 *在读写文本数据时，使用高级流进行流连接中是非常重要的一环，起到承上启下的作用。
 *以为几乎所有的字符流都只能连接在其他字符流上，而基本上低级流都是字节流，由于转换流可以连接字节流，
 *而本身其自身又是字符流，所以起到将字符流与字节流"对接"的作用。
 *	
 */
public class OutputStreamWriterDemo09 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");//以utf-8字符集进行编码，后面的参数可以不写
		osw.write("的季后赛的反馈");
		osw.write('啊');
		osw.close();
	}

}
