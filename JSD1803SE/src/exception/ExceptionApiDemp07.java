package exception;
/**
 * �쳣���÷���
 * @author Administrator
 *
 */
public class ExceptionApiDemp07 {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try{
			String str = "a";
			System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			//�����ջ������Ϣ�������ڶ�λ���󲢽��
			e.printStackTrace();
			//��ȡ������Ϣ
			String str = e.getMessage(); //���Լ��׵��쳣throw new Exceotion("xx"),��ôe.getMessage()���صľ���"xx"
			System.out.println(str);
		}
		System.out.println("���������");
	}
}
