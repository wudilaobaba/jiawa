package raf;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
/**
 * 练习
 * 完成一个简易记事本工具
 * 程序启动后，用户在控制台输入的每一行字符串都写入到文件note.txt中。当用户输入exit时，程序退出
 * @author Administrator
 *
 */
public class NoteDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		RandomAccessFile file = new RandomAccessFile("./note.txt","rw");
		file.seek(file.length());
		String str;
		do{
			str = scan.next();
			if("exit".equals(str)){   //字符串比较的时候，要 字符串.equals(变量) 防止空指针异常
				file.write("".getBytes());
			}else{
				byte[] s = str.getBytes("gbk");
				file.write(s);
			}
			
		}while(!str.equals("exit"));
		file.close();
		System.out.println("Bye");
	}

}
