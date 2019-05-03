package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取一个字节
 * @author Administrator
 *
 */
public class ReadDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","r"); ///只读操作
		int d = raf.read();//不传参，默认只读一个字节，返回值为读到的那个字节的二进制转为十进制后的数字(该值最大为255)
		//因为写一个字节的时候，只写入了低八位，所以最大为11111111  ，此时再转为int类型，最大就是255
		//若返回值为-1，则表示读到了文件的末尾
		
		d = raf.read();//再读一个字节
		d = raf.read();//再读一个字节
		d = raf.read();//再读一个字节  -1读出来是255
		//d = raf.read();//再读一个字节   -1
		
		System.out.println(d);
		raf.close();
		
		
	}

}
