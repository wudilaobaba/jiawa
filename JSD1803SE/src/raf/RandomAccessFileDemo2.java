package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写基本类型数据，以及RAF指针的操作
 * @author Administrator
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		long pos = raf.getFilePointer();//获取当前指针的位置,位置就是当前指针在第几个字节上的第一位上
		System.out.println("当前指针的位置:"+raf.getFilePointer());
		//向文件中写入int最大值
		/**
		 * 01111111 11111111 11111111 11111111
		 * >>>24  将二进制向右移动24次成为以下
		 * 00000000 00000000 00000000 01111111     11111111 11111111 11111111(后面这三个溢出)
		 * 
		 * >>>24  将二进制向右移动16次成为以下
		 * 00000000 00000000 01111111 11111111
		 * 
		 * >>>24  将二进制向右移动8次成为以下
		 * 00000000 01111111 11111111 11111111
		 * 
		 * >>>24  将二进制向右移动0次成为以下
		 * 01111111 11111111 11111111 11111111
		 */
		int max = Integer.MAX_VALUE;
		raf.write(max>>>24);
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max); //最后一次不用移动
		System.out.println("当前指针的位置:"+raf.getFilePointer());//4 也就是第五个位置
		
		/**
		 * 一次性将给定的int值的4字节全部写出
		 */
		raf.writeInt(max);//写int值的方法
		
		raf.writeLong(123L);//写long值的方法
		System.out.println("当前指针的位置:"+raf.getFilePointer());
		
		System.out.println("写出完毕");
		
		
//		raf.seek(0);//将指针移动到位置0 (参数不能是负数，范围为0~文件的长度)
		int y = raf.read();//文件的操作默认都是在指针当前位置进行
		System.out.println(y);
		
		raf.seek(0);
		int y1 = raf.readInt();
		//readInt：一次读4个字节，最后将这4个字节转为一个int值
		//readLong：一次读8个字节，最后将这8个字节转为一个long值
		//所以，不重置指针的话会报错EOF  end of file 文件末尾  而不是返回-1 
		System.out.println("当前指针的位置:"+raf.getFilePointer());
		System.out.println(y1);
		
		raf.seek(8);
		long h = raf.readLong();
		System.out.println(h);
		
		raf.seek(0);
		long j = raf.readLong();//相当于读了8个字节，但是读的是前两个int的二进制拼接后读的
		System.out.println(j);
		
		
		raf.close();
		
		
		
		//以上写完，文件中共16个字节  1个int是4个字节    long和double都是8个字节
	}
}
