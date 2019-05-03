package oo.day04_1;
//重写的演示
public class OverRideDemo {

	public static void main(String[] args) {
		

	}

}
class Coo{
	Doo show(){//返回值是Doo的方法
		return null;
	}
}
class Doo extends Coo{
//	Coo show(){//返回值类型为超类类型，超类类型大于上面的的Coo中的Doo类型，所以报错了
//		return null;
//	}
}