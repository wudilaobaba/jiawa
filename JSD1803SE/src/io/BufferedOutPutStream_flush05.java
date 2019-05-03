package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 05.
 * 缓冲输出流写数据时的缓冲区问题
 * @author Administrator
 *
 */
public class BufferedOutPutStream_flush05 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("./bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String line = "夜空中最亮的星";
		byte[] data = line.getBytes("utf-8");
		bos.write(data);
		//写的时候不足以装满8kb，是不会将数据写出去的，想要强制写出去就用bos.flush();装不满缓冲区(8k)是不会自动去送砖的
		//bos.flush();//想做到即时性，就建议调用flush
		bos.close();//close里面自带了flush方法
		System.out.println("写出完毕");
	}

}
