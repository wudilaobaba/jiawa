package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 列出所有注册用户信息
 * @author Administrator
 *
 */
public class Demo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./user.dat","r");
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(i*100);//不读昵称和年龄，就加上词句，并删掉下面读昵称和年龄的代码
			//读用户名：
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"utf-8").trim();
			//读密码：
			data = new byte[32];
			raf.read(data);
			String pwd = new String(data,"utf-8").trim();
			//读昵称：
			data = new byte[32];
			raf.read(data);
			String nick = new String(data,"utf-8").trim();
			//读年龄：
			int age = raf.readInt();
			
			String str = name + "," + pwd + "," + nick + "," + age;
			System.out.println(str);
			System.out.println("当前指针位置："+raf.getFilePointer());
		}
		raf.close();
	}

}
