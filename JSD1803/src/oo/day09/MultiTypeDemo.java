package oo.day09;
//多态的演示
public class MultiTypeDemo {

	public static void main(String[] args) {
		Moo o = new Noo();//向上造型(自动类型转化)
		Noo o1 = (Noo)o;
		Inter8 o2 = (Inter8)o;
		//Poo o3 = (Poo)o;//类型转换异常
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
