package file;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ���ļ�
 * @author Administrator
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException{
		/**
		 * �ڵ�ǰĿ¼�´���test.txt�ļ�
		 */
		File file = new File("./test.txt");
		if(!file.exists()){//exists()�ж�test.txt�Ƿ����
			System.out.println("������");
			file.createNewFile();//����͵���ӣ�˫��Add throws  ��������´����ļ�һ��Ҫ�����쳣����
		}else{
			System.out.println("�ļ��Ѵ���");
		}
	}

}
