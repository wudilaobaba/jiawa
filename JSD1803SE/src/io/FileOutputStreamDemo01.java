package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 01
 * java标准io操作  Input，Output输入与输出
 * 流按照功能分为读写;按照方向分为输入，输出。
 * 而方向的参照物为我们写的程序
 * 输入流用来读取数据
 * 输出流用来写出数据
 * 
 * java.io.InputStream是所有字节输入流的父类，规定了所有输入流都应当具备的读取数据字节的相关方法
 * java.io.OutputStream是所有字节输出流的父类
 * java将流分为了两大类：节点流和处理流
 * 
 * 节点流：又称为低级流，是实际连接程序与另一端的"管道",负责实际搬运数据。读写一定是建立在低级流的基础之上进行的。
 * 处理流：又称高级流，不能独立存在(没意义),高级流一定会连接在其他流上，是数据"流经"该流时对其进行加工处理,简化我们对数据读写时的某些操作。
 * 文件流：是一对低级流,用于读写文件数据。功能与RAF一样。但是底层的读写方式不同。流是顺序读写的。而RAF是基于指针随机读写的。(流没有seek,RAF有Seek)
 * 
 * java中的io是顺序读写(覆水难收)，而RandomAccessFile是随机读写(只用来读文件)
 * @author Administrator
 * 
 * 81128100197817
 * gxbsdf11
 */
public class FileOutputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		/**
		 * 向文件fos.txt中写出字符串
		 */
		File file = new File("./fos.txt");
		FileOutputStream fos = new FileOutputStream(file);
		//FileOutputStream fos = new FileOutputStream("./fos.txt");     //不加true是覆盖内容
		//FileOutputStream fos = new FileOutputStream("./fos.txt",true);//加true是追加内容
		//fos.write(1); //write方法与之前所学的RandomAccessFile是一样的
		String str = "像一棵海草海草海草海草，随风飘摇";//将该字符串改变后，再执行一次的话会先将原数据完全抹掉再写，这点与RandomAccessFile不同
		fos.write(str.getBytes("utf-8"));
		System.out.println("写出完毕");
		fos.close();
		
		//流只能做到两点：1.抹了重新写；2.追加内容
		//无法像RandomAccessFile修改密码案例那样在中间操作
	}

}
