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
		try{
			String str = "a";
			/*
			 *��JVMִ�д���ʱ�����쳣ʱ����ʵ�������쳣��һ��ʵ����Ȼ�����úô���ִ�еĹ��̣��������쳣�׳�
			 *����׳��쳣�Ĵ������ڷ���û�д����쳣���������쳣���׵���ǰ����֮�⣬�ɵ��õ�ǰ�����Ĵ���Ƭ��ȥ����
			 */
			System.out.println(str.length());//��ָ���쳣
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			//��main�����г��ֵ��쳣����ô˭����main��˭�������쳣��
			//��ʱ��������ڵ���main��������ô��Ȼû�����쳣������ô��ֱ�ӽ�����ɱ��������Ĵ���Ͳ�ִ���ˣ���������
			System.out.println("��������"); //���������쳣����ô��ֱ�ӽ�catch�ˣ�����ִ����һ��
			//catch���Զ����������Էֱ𲶻���Щ�쳣
		}catch(NullPointerException e){ //����ֻ�����ָ���쳣
			System.out.println("�����˿�ָ��");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�ַ����±�Խ��");
			//�����ʹ��һ��Exception��һ����ϰ�ߣ����Ա������쳣���³����ж�
			//����˳��Ӧ�����������쳣�������Ȳ��񣬸������쳣���º󲶻�
		}catch(Exception e){//����������catch�е��쳣֮�⻹��û���ǵ����쳣����ô��д����Ĳ���Exception e����һ���������쳣���ͻ�ֱ�Ӳ���
			System.out.println("�������ǳ��˸���");
		}
		//Exception�������쳣�ĸ���
		
		System.out.println("���������");
	}
}
