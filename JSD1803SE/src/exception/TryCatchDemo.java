package exception;
/**
 * 01.
 * java�쳣�����е�try-catch
 * �﷨��
 * try{
 * 	����Ƭ��
 * }catch(XXXException e){
 * 	����try����Ƭ���г��ֵ�XXXException��Ĵ����ֶ�
 * }
 * @author Administrator
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		String str = null;
		/*
		 *��JVMִ�д���ʱ�����쳣ʱ����ʵ�������쳣��һ��ʵ����Ȼ�����úô���ִ�еĹ��̣��������쳣�׳� 
		 *����׳��쳣�Ĵ������ڷ���û�д����쳣���������쳣���׵���ǰ����֮�⣬�ɵ��õ�ǰ�����Ĵ���Ƭ��ȥ����
		 */
		System.err.println(str.length());//��ָ���쳣
		//��main�����г��ֵ��쳣����ô˭����main��˭�������쳣��
		//��ʱ��������ڵ���main��������ô��Ȼû�����쳣������ô��ֱ�ӽ�����ɱ��������Ĵ���Ͳ�ִ���ˣ���������
		System.out.println("���������");
	}
}
