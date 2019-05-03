package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字符串
 * @author Administrator
 *
 */
public class ReadStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./raf.txt","r");
		//读一个字符，该字符是中文，在utf-8时是读3个字节，在gbk时是两个字节   若是英文则是一个字节，怎样读
		byte[] data = new byte[(int)raf.length()];//length() 返回./raf.txt文件的总字节数为long型
		raf.read(data);
		
		//字节数组转为字符串
		//String str = new String(data); //使用系统默认的字符集
		String str = new String(data,"utf-8"); //使用指定的字符集          两边约定好，我用utf-8写，你用utf-8读
		System.out.println(str);
		raf.close();
		/**
		 * '范'
		 * utf-8的2进制：  unicode为33539 对应的二进制为1000 0011 0000 0011
		 * 其三个字节组成为：
		 * 11101000
		 * 10001100
		 * 10000011
		 * 
		 * utf-8编码时，如果第一个字节是的前四位是：
		 * 1110 该字符是用3个字节表示的     后面的每个字节都是以10开头的
		 * 1100        2
		 * 1111        4
		 * 
		 * 如 1110xxxx 10xxxxxx 10xxxxxx   x的地方才是有效位，将'范'的有效位提出来就是1000 0011 0000 0011，与上面的二进制一样
		 * 
		 * 所以：utf-8就是将字符的unicode的二进制进行拆分，1110跟着前四位 10跟着接下来的6位，10跟着最后的6位，就是utf-8的编码规则
		 * 
		 */
	}

}
