package file;

import java.io.File;

/**
 * ����һ���༶Ŀ¼ mkdirs
 * @author Administrator
 *
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/**
		 * �ڵ�ǰĿ¼�´���a/b/c/d/e/fĿ¼
		 * mkdirs�����Ὣ���в����ڵĸ�Ŀ¼ͬʱ��������
		 */
		File dir = new File("./a/b/c/d/e/f");
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("Ŀ¼�������");
		}else{
			System.out.println("Ŀ¼�Ѿ�����");
		}
	}

}
