package file;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е���������
 * @author Administrator
 *
 */
public class ListFileDemo {

	public static void main(String[] args) {
		/**
		 * ��ȡ��ǰĿ¼�е���������
		 * dir.isDirectory()//�ж��Ƿ�ΪĿ¼
		 * dir.isFile();�ж��Ƿ�Ϊ�ļ�
		 */
		File dir = new File(".");//��ʾ��ǰĿ¼
		if(dir.isDirectory()){
			//��ȡĿ¼����������
			File[] subs = dir.listFiles();
			System.out.println(subs.length);
			for(int i=0;i<subs.length;i++){
				System.out.println(subs[i].getName());
			}
		}
		
	}

}
