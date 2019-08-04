package reflect;
/**
 * 使用该类测试反射机制
 * @author Administrator
 *
 */
public class Person02 {
	public Person02(){
		System.out.println("启用无参构造方法了");
	}
	public void sayHello(){
		System.out.println("大家好");
	}
	public void sayHello(String name){
		System.out.println("带一个参数的");
	}
	public void sayHello(String name,int age){
		System.out.println("带两个参数的");
	}
	private void dosome(){
		System.out.println("私有...");
	}
}
