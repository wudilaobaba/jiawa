package string;
/**
 * String substring(int s,int e) ��ͷ����β
 * ��ȡ��ǰ�ַ���ָ����Χ�ڵ����ַ���
 * @author Administrator
 *
 */
public class SubString {

	public static void main(String[] args) {
		String str = "thinking in java";
		//��ȡ"ing"
		String sub = str.substring(5,8);
		System.out.println(sub);
		
		//��ȡ�±�Ϊ3�����
		String sub1 = str.substring(3);
		System.out.println(sub1);
		
		System.out.println(getHostName("www.souhu.com"));
	}
	
	//��www.baidu.com��ȡΪbaidu
	public static String getHostName(String str){
		int start = str.indexOf(".")+1;
		int end = str.indexOf(".",start);
		return str.substring(start, end);
	}

}
