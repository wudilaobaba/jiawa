package exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * JDK1.7�Ժ󣬿��������¼��д��������IO�쳣�Ĵ���
 * ������:�Զ��ر�
 * @author Administrator
 *
 */

public class FinallyDemo03 {
	//���ձ��������ǻὫ���´���תΪFinallyDemo02�е�����
	public static void main(String[] args) {
		try(
			//ֻ��ʵ����AutoCloseable�ӿڵĿ��Զ���������
			FileInputStream fis = new FileInputStream("./fos.txt");
		){
			int d = fis.read();
			System.out.println(d);
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
