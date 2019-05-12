package exception;

public class TrrowDemo05 {

	public static void main(String[] args) throws Exception { //异常处理手段02.加throws Exception
		System.out.println("程序开始了");
		Person04 p =  new Person04();
		//异常处理手段01.使用try catch
//		try {
//			p.setAge(400); //此句会自动报错，点击左边的小叉叉会提示必须加try catch
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(p.getAge());
		System.out.println("程序结束");
	}
	//永远不要在main方法上使用throws!!!!!!!!!!!!!!!!!!!!!!!!!!
}
