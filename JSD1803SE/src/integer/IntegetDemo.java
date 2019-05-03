package integer;
import object.Point;
public class IntegetDemo {

	public static void main(String[] args) {
		show("dd");
		show(new Point(1,2));
		int a = 10;
		Integer in = new Integer(a);//基本类型 hao xiang 不能当做对象传入，要包一个壳
		show(in);
		show(1);//也可以啊？？？？？？？？？？？？？？？
		a = in.intValue();
	}
	public static void show(Object obj){
		
	}

}

//一定要打开注释看
//class Integer{
//	private int d;
//	public Integer(int d){
//		this.d = d;
//	}
//	public int intValue(){
//		return d;
//	}
//}
