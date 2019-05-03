package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 03
 * 使用文件流完成文件的复制操作
 * @author Administrator
 *
 */
public class Copy03 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./fos.txt");
		FileOutputStream fos = new FileOutputStream("./fos_cp.txt");
		byte[] b = new byte[1024*10];
		int len = -1;
		while((len = fis.read(b))!=-1){
			fos.write(b,0,len);
		}
	}

}
