package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �������ڼ̳г���ʱ����д�䷽������ô����д���෽���к���throws�����쳣�׳��ķ���ʱ��
 * ��throws����д����
 * @author Administrator
 *
 */
public class ThrowsDemo06 {
	public void dosome() throws IOException,AWTException{
		
	}
}

//������дʱ��01.���Բ����쳣��02.��ֻ�ײ����쳣��03.���׳������쳣��������
class Son extends ThrowsDemo06{
	public void dosome() throws FileNotFoundException{ //�׳������쳣��������
		
	}
}