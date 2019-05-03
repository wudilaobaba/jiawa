package integer;

public class IntegetDemo1 {
	/**
	 * 由于基本类型不能直接参与面向对象的开发，所以java提供了8个基本类型所对应的包装类，
	 * 从而可以将基本类型转换为“对象”，这样就可以参与面向对象的模式进行开发了
	 * 6个数字类型的包装类继承自java.lang.Number
	 * Number是一个抽象类，定义了可以让数字类型之间进行互转的方法
	 */
	public static void main(String[] args) {
		//将数字变成包装类
		int d = 1;
		int a = 127;
//		Integer i1 = new Integer(d);
//		Integer i2 = new Integer(d);
		Integer i1 = Integer.valueOf(d); //long和int只缓存一字节以内的整数127  建议这样转包装类 推荐
		Integer i2 = Integer.valueOf(d);
		Long i3 = Long.valueOf(a);          //Double.valueOf();不会缓存
		Long i4 = Long.valueOf(a);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		//包装类转为基本类型
		int in = i1.intValue();
		double o = i1.doubleValue();
		System.out.println(o);
		byte b = i1.byteValue();
		System.out.println(b);
	}

}

