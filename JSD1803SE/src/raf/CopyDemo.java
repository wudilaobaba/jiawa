package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件（通用方法,复制任何格式的文件）  缺点：太耗时，后面会优化
 * @author Administrator
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 复制当前目录中的img.png文件
		 */
		RandomAccessFile src = new RandomAccessFile("./img.png","r");
		RandomAccessFile desc = new RandomAccessFile("./img_cp.png","rw");
		int d = -1;//记录每次读取的字节数据
		while((d=src.read())!=-1){
			desc.write(d);
		}
		System.out.println("复制完毕");
		src.close();
		desc.close();
	}

}
