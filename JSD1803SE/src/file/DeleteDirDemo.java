package file;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * @author Administrator
 *
 */
public class DeleteDirDemo {

	public static void main(String[] args) {
		/**
		 * ����ǰĿ¼�е�demoĿ¼ɾ��
		 */
		File dir = new File("./demo");
		if(dir.exists()){
			dir.delete();//ֻ��ɾ����Ŀ¼ ���������������������� 
			System.out.println("ɾ�����");
		}else{
			System.out.println("Ŀ¼�����ڣ�");
		}

	}

}
