package string;
/**
 * char charAt(int index)
 * @author Administrator
 *
 */
public class CharAt {

	public static void main(String[] args) {
		String str = "klsha5";
		//�鿴������ַ���ʲô
		System.out.println(str.charAt(4));
		
		
		
		//�����ģ��Ϻ�����ˮ���Ժ���
		String info = "�Ϻ�����ˮ���Ժ���";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i) != info.charAt(info.length()-i-1)){
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");
	}

}
