package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 * @author Administrator
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException{
		/**
		 * 在当前目录下创建test.txt文件
		 */
		File file = new File("./test.txt");
		if(!file.exists()){//exists()判断test.txt是否存在
			System.out.println("不存在");
			file.createNewFile();//报错就点叉子，双击Add throws  正常情况下创建文件一定要进行异常处理
		}else{
			System.out.println("文件已存在");
		}
	}

}
