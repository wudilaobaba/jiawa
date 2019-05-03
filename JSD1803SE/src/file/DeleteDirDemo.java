package file;

import java.io.File;

/**
 * 删除目录
 * @author Administrator
 *
 */
public class DeleteDirDemo {

	public static void main(String[] args) {
		/**
		 * 将当前目录中的demo目录删除
		 */
		File dir = new File("./demo");
		if(dir.exists()){
			dir.delete();//只能删除空目录 ！！！！！！！！！！！ 
			System.out.println("删除完毕");
		}else{
			System.out.println("目录不存在！");
		}

	}

}
