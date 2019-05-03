package string;
/**
 * char charAt(int index)
 * @author Administrator
 *
 */
public class CharAt {

	public static void main(String[] args) {
		String str = "klsha5";
		//查看第五个字符是什么
		System.out.println(str.charAt(4));
		
		
		
		//检测回文：上海自来水来自海上
		String info = "上海自来水来自海上";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i) != info.charAt(info.length()-i-1)){
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");
	}

}
