package file;

import java.io.File;

/**
 * 创建一个多级目录 mkdirs
 * @author Administrator
 *
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/**
		 * 在当前目录下创建a/b/c/d/e/f目录
		 * mkdirs方法会将所有不存在的父目录同时创建出来
		 */
		File dir = new File("./a/b/c/d/e/f");
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("目录创建完毕");
		}else{
			System.out.println("目录已经存在");
		}
	}

}
