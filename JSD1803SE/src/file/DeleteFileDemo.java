package file;

import java.io.File;

/**
 * ɾ��һ���ļ�(����������վ)
 * @author Administrator
 *
 */
public class DeleteFileDemo {

	public static void main(String[] args) {
		/**
		 * ����ǰĿ¼�е�test.txtɾ��
		 */
		File file = new File("./test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("ɾ�����");
		}else{
			System.out.println("���ļ�������");
		}
	}

}
