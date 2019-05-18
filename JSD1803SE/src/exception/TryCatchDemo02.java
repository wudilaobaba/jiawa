package exception;

public class TryCatchDemo02 {
	public static void main(String[] args){
		System.out.println(fun());
	}
	
	public static int fun(){
		try{
			String str = "";
			System.out.println(str.charAt(0));
			return 0; //若执行了这里的return,那么外面的return就不会执行
		}catch(NullPointerException e){
			System.out.println("出现了空指针");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界");
		}finally{
			System.out.println("我就执行finally");
		}
		return 1;
	}
}
