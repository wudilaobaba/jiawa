package exception;

public class TryCatchDemo02 {
	public static void main(String[] args){
		System.out.println(fun());
	}
	
	public static int fun(){
		try{
			String str = "";
			System.out.println(str.charAt(0));
			return 0; //��ִ���������return,��ô�����return�Ͳ���ִ��
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ��");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�ַ����±�Խ��");
		}finally{
			System.out.println("�Ҿ�ִ��finally");
		}
		return 1;
	}
}
