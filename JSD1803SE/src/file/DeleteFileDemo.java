package file;

import java.io.File;

/**
 * 删除一个文件(不会进入回收站)
 * @author Administrator
 *
 */
public class DeleteFileDemo {

	public static void main(String[] args) {
		/**
		 * 将当前目录中的test.txt删除
		 */
		File file = new File("./test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("删除完毕");
		}else{
			System.out.println("该文件不存在");
		}
	}

}
