package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册功能  注意给字符串留白，规定最多只能输入32个字节，针对32个字节进行留白
 * 用户信息包含：用户名 密码 昵称 年龄
 * 年龄为int，其余为字符串
 * 每个用户的信息都要写入文件user.dat中保存
 * 每条记录的长度固定为100字节，其中用户名，密码，昵称三项各占32字节，年龄int为4字节
 * 字符串"留白"操作更便于修改内容，不会影响整个文件的格式
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("欢迎注册");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入用户名：");
		String name = scan.nextLine();
		
		System.out.println("请输入密码：");
		String pwd = scan.nextLine();
		
		System.out.println("请输入昵称：");
		String nick = scan.nextLine();
		
		System.out.println("请输入年龄：");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("name:"+name);
		System.out.println("pwd:"+pwd);
		System.out.println("nick:"+nick);
		System.out.println("age:"+age);
		
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		raf.seek(raf.length());//每次都在指针末尾开始写
		//写用户名
		byte [] data = Arrays.copyOf(name.getBytes("utf-8"), 32);
		raf.write(data);
		//写密码
		data = Arrays.copyOf(pwd.getBytes("utf-8"), 32);
		raf.write(data);
		//写昵称
		data = Arrays.copyOf(nick.getBytes("utf-8"), 32);
		raf.write(data);
		//写年龄
		raf.writeInt(age);
		System.out.println("注册完毕,此时文件增加了100字节");
		raf.close();
	}

}
