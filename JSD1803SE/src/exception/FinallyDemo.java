package exception;
/**
 * 02.
 * finally�����쳣��������е����һ��
 * finally����ֱ�Ӹ���try����������һ��catch֮��
 * finally���Ա�ֻ֤Ҫ����ִ�е�try�����У�����try����Ĵ����Ƿ��׳��쳣��finally���еĴ��붼�ض�ִ��(try����returnʱ��finally�еĴ���ҲҪִ��)
 * ͨ���Ὣ�����Ƿ�����쳣��Ҫ���еĴ������finally��ȷ�����У�����IO�����еĹر���
 * ===========try����returnʱ����ִ��finally�еĴ���,��ִ��return
 * ===========ִ��˳��try-catch-finally-return
 * @author Administrator
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try{
			String str = "";
			System.out.println(str.length());
			return;
		}catch(Exception e){
			System.out.println("���������");
		}finally{
			System.out.println("finally�еĴ���ִ����");
		}
		System.out.println("���������");
	}
}
