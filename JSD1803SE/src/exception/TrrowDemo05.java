package exception;

public class TrrowDemo05 {

	public static void main(String[] args) throws Exception { //�쳣�����ֶ�02.��throws Exception
		System.out.println("����ʼ��");
		Person04 p =  new Person04();
		//�쳣�����ֶ�01.ʹ��try catch
//		try {
//			p.setAge(400); //�˾���Զ����������ߵ�С������ʾ�����try catch
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(p.getAge());
		System.out.println("�������");
	}
	//��Զ��Ҫ��main������ʹ��throws!!!!!!!!!!!!!!!!!!!!!!!!!!
}
