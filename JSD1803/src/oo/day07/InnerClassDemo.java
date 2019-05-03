package oo.day07;
//成员内部类的演示
public class InnerClassDemo {
	
	public static void main(String[] args) {
		Mama mama = new Mama();
		//Baby baby = new Baby(); //编译错误
	}

}
class Mama{
	private String name;
	void createBaby(){
		Baby baby = new Baby();
	}
	class Baby{
		void showName(){
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name);//这里的this就是Baby自己的name,但是现在没有name,所以报错
		}
	}
}