package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * 提高每次读写的数据量，减少实际读写次数，可以提高读写效率
 * 对于硬盘(磁盘)而言，读写效率是缺点。但是硬盘块读写效率还是可以保证的。
 * 随机读写：单字节读写         //机械硬盘效率差
 * 块读写：一组一组字节读写 //机械硬盘效率还可以
 * 以上两种读写，在固态硬盘中效率差别不大
 * @author Administrator
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		/**
		 * 复制当前目录中的xx.xx文件
		 */
		RandomAccessFile src = new RandomAccessFile("./xx.xx","r");
		RandomAccessFile desc = new RandomAccessFile("./xx_cp.xx","rw");
		
		long start = System.currentTimeMillis();
		/**
		 * int read(byte[] data)  //一次性读data这个字节数组；返回值为一共读取了多少个字节   返回值为-1则表示读到了文件末尾
		 * 一次性读取给定字节数组长度的字节量并并存入到该数组中，返回值为实际读取到的字节量
		 * 若文件只有30kb ，但是写的是一次读100kb，那么实际读到的字节量就是30kb
		 * 
		 * 1 byte = 8位二进制
		 * 1 kb = 1024 byte
		 * 1 mb = 1024 kb
		 * 1 gb = 1024 mb
		 * 1 tb = 1024 gb
		 */
		/**
		 * void write(byte[] data) //一次性将给定的字节数组中所有字节写出
		 * void write(byte[] data,int index,int len) //将给定字节数组从下标index处开始的连续len个字节一次性写出
		 */
		int len = -1;
		byte[] buf = new byte[1024 * 10]; //建议一次性读8~10kb
		while((len=src.read(buf))!=-1){
			System.out.println(len);
			desc.write(buf,0,len);//重载  将读到的字节数组写入文件   从该字节buf数组的第0个开始写，一共写len个
		}
		
		long end = System.currentTimeMillis();
		System.out.println("复制完毕,耗时："+(end-start)+"ms");
		src.close();
		desc.close();
	}

}
