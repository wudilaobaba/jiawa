package string;
/**
 * String substring(int s,int e) 含头不含尾
 * 获取当前字符串指定范围内的子字符串
 * @author Administrator
 *
 */
public class SubString {

	public static void main(String[] args) {
		String str = "thinking in java";
		//截取"ing"
		String sub = str.substring(5,8);
		System.out.println(sub);
		
		//截取下标为3至最后
		String sub1 = str.substring(3);
		System.out.println(sub1);
		
		System.out.println(getHostName("www.souhu.com"));
	}
	
	//将www.baidu.com截取为baidu
	public static String getHostName(String str){
		int start = str.indexOf(".")+1;
		int end = str.indexOf(".",start);
		return str.substring(start, end);
	}

}
