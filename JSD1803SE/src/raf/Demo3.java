package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 登录验证
 * 程序启动后，要求用户输入用户名及密码，然后匹配user.dat文件中的用户，若用户名及密码输入正确提示输入成功，否则输出不正确
 * 新增修改密码的功能
 * @author Administrator
 *
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		byte b[] = new byte[32];
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("姓名：");
		String name = scan.nextLine();
		System.out.println("密码：");
		String pwd = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(100*i);
			raf.read(b);
			String nameTest = new String(b,"utf-8").trim();
			raf.read(b);
			String pwdTest = new String(b,"utf-8").trim();
			if(name.equals(nameTest) && pwd.equals(pwdTest)){
				flag = true;
				raf.seek(100*i+32);
				break;
			}
		}
		
		if(flag){
			System.out.println("正确,请修改您的密码");
			String rpwd = scan.nextLine();
			raf.write(Arrays.copyOf(rpwd.getBytes("utf-8"), 32));
			System.out.println("密码修改成功");
		}else{
			System.out.println("错误");
		}
		raf.close();
	}

}
