package cn.tedu.jdbc.day01;

public class Demo01 {
	//主要是进行普通jar包引入eclipse中的具体实现方法
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OK");
	}

}
