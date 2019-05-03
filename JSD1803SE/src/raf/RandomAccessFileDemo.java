package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 该类设计用来专门读写文件数据。其基于指针进行读写
 * 即：总是在指针当前位置读或写字节
 * RAF有两种创建模式：
 * "r":只读模式
 * "rw":读写模式
 * @author Administrator
 *
 */
public class RandomAccessFileDemo {//必须抛异常

	public static void main(String[] args) throws IOException {
		/**
		 * RAF常用的构造方法：
		 * RandomAccessFile(String path,String mode);
		 * RandomAccessFile(File file,String mode);
		 * mode:操作模式，只读 或 读写
		 */
		//RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		//或
		File file = new File("./raf.dat");
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		//"rw"模式下-->若raf.dat文件不存在就会自动创建
		//"r"模式下-->会抛异常
		
		//***写的话只能写二进制！！！！！！！！！！！！！！！
		//文本-->先将文本转为二进制
		//mp3-->先将mp3转为二进制
		//图片-->先将图片转为二进制
		
		/**
		 * void write(int d)  --->只写一个字节  （参数可以为int和char类型） 最终都转为二进制后，取低八位来写入
		 * 写出一个字节，将给定的int值对应的二进制的"低八位"写入文件
		 * 
		 * 00000000 00000000 00000000 00000001
		 *                              低八位
		 * 每次运行都是从头写，而不是追加内容                      
		 */
		//raf.write(1);//相当于往文件中写了 00000001  此时写的只是单纯的2进制，而不是字符1
		//raf.write(65534);//参数转2进制后取低八位
		raf.write('王');//参数转2进制后取低八位      字符王的二进制 //1110011 10001011   低八位自己算为139
		raf.write(66);//参数转2进制后取低八位
		raf.write(29579);//字符'王'的编码 对应二进制是16位     //参数转2进制后取低八位
		//以上文件里为 00000001 00000001
		
		raf.write(-1);//相当于写了 11111111
		raf.write(256);//相当于写了 00000000
		System.out.println("写出完毕");
		raf.close();//只要IO，最后必须写raf.close(); 不然会出现"当前文件正在被xxx使用"
		
		//若用记事本打开刚刚的文件，那么记事本会使用unicode字符集与每个二进制进行匹配，匹配到unicode字符则转为字符，否则就是"乱码"
		//不要什么都拿记事本打开
		System.out.println(Integer.toBinaryString('王'));//1110011 10001011   139
		
		/**
		 * 一点小补充：
		 * 你好 用utf8进行编码，会写出6个字节，此时再重新用gbk进行编码，只覆盖了6个中的前4个字节，后面两个字节没有覆盖掉，所以就必须要删一下才行
		 */
	}

}
