package file;

import java.io.File;

/**
 * ʹ��File����һ��Ŀ¼
 * @author Administrator
 *
 */
public class MakeDirDemo {
	public static void main(String[] args) {
		/**
		 * �ڵ���Ŀ¼�½�һ��Ŀ¼demo
		 */
		File dir = new File("./demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("Ŀ¼�Ѵ���");
		}else{
			System.out.println("Ŀ¼�Ѵ���");
		}
	}
}
