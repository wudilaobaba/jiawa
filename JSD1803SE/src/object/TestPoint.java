package object;
/**
 * 测试Point重写的Object方法
 * @author Administrator
 *
 */
public class TestPoint {
	
	public static void main(String[] args) {
		Point p = new Point(1,2);
		String str = p.toString();
		System.out.println(str);//object.Point@15db9742 是该对象的地址信息，实际开发中意义不大
		
		System.out.println(p.toString());
		
		//println方法的参数就是对象，返回的是参数执行toString()后的返回值   前面StringBuilder方法的输出可以这样试一下
		System.out.println(p);
		
		
		Point p2 = new Point(1,2);
		System.out.println(p==p2);//双等判断的是地址
		System.out.println(p.equals(p2));//Object内部提供的equals就是双等于比较（比较的也是地址）  ----->return this==参数obj
	}

}
