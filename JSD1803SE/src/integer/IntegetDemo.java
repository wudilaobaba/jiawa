package integer;
import object.Point;
public class IntegetDemo {

	public static void main(String[] args) {
		show("dd");
		show(new Point(1,2));
		int a = 10;
		Integer in = new Integer(a);//�������� hao xiang ���ܵ��������룬Ҫ��һ����
		show(in);
		show(1);//Ҳ���԰�������������������������������
		a = in.intValue();
	}
	public static void show(Object obj){
		
	}

}

//һ��Ҫ��ע�Ϳ�
//class Integer{
//	private int d;
//	public Integer(int d){
//		this.d = d;
//	}
//	public int intValue(){
//		return d;
//	}
//}
