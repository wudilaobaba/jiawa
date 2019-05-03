package file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2 {
	/**
	 * File提供了一个重载的listFiles方法，可以指定一个文件过滤器，
	 * 然后将一个目录中满足过滤器要求的子项返回。
	 * 不满足的则忽略
	 * 获取当前目录中所有文本文件(过滤器的使用)
	 * @param args
	 */
	public static void main(String[] args) {
		File dir = new File(".");//当前目录
		File[] subs = dir.listFiles(new FileFilter(){ //定义过滤器
			public boolean accept (File file){
//				String name = file.getName();
//				System.out.println("正在过滤"+name);
//				return name.endsWith(".txt");
				return file.isDirectory();
			}
		});
		//为了简化匿名内部类，可以使用以下的lambda表达式(后面会讲)
//		File[] subs = dir.listFiles(
//			(file)->file.getName().endsWith(".txt")
//		);
		System.out.println(subs.length);//只返回以.txt结尾的文件
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}
