package oo.day09;
//��̬����ʾ
public class MultiTypeDemo {

	public static void main(String[] args) {
		Moo o = new Noo();//��������(�Զ�����ת��)
		Noo o1 = (Noo)o;
		Inter8 o2 = (Inter8)o;
		//Poo o3 = (Poo)o;//����ת���쳣
		if(!(o instanceof Poo)){
			System.out.println("445");
		}
	}

}

interface Inter8{
	
}
class Moo{
	
}
class Noo extends Moo implements Inter8{
	
}
class Poo extends Moo{
	
}
