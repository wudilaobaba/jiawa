package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author Administrator
 *
 */
public class ListFileDemo {

	public static void main(String[] args) {
		/**
		 * 获取当前目录中的所有子项
		 * dir.isDirectory()//判断是否为目录
		 * dir.isFile();判断是否为文件
		 */
		File dir = new File(".");//表示当前目录
		if(dir.isDirectory()){
			//获取目录中所有子项
			File[] subs = dir.listFiles();
			System.out.println(subs.length);
			for(int i=0;i<subs.length;i++){
				System.out.println(subs[i].getName());
			}
		}
		
	}

}
