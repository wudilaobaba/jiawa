package object;

public class Demo {
	//当一个类没有做任何继承的时候，后面默认会有一个extends Object
	//所有类都能使用Object东西类的方法
	private int age = 10;
	//get set方法
	public void setAge(int age){
		if(age>100 || age<0){
			return;
		}
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.toString();
	}

}
