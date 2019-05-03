package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写出字符串操作
 * String提供的方法  byte[] getBytes()//按照系统默认的字符集的来 （当前系统默认的是GBK）
 * byte[] getBytes(String 字符集名字)//将当前字符串按照指定字符集转换成一组字节(推荐，这样避免了跨平台出现的乱码现象)
 * @author Administrator
 * 以下两种字符集：
 * GBK:国标编码 中文占2个字节
 * UTF-8:万国码，对unicode进行编码，变长的编码集，英文1字节，中文3字节
 * ISO8859-1:欧洲编码集，不支持中文	
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * 不写./ 就是当前目录中
		 */
		RandomAccessFile raf = new RandomAccessFile("./raf.txt","rw");
		String str = "让我再看你一遍，从南到北";
		byte[] data = str.getBytes("gbk");//将字符串转成一组字节
		System.out.println(data.length);//24个字节
		raf.write(data);
		raf.write("真的啊".getBytes("utf-8"));
		System.out.println("写出完毕");
		raf.close();
	}

}
