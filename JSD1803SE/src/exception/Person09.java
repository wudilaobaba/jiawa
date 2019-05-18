package exception;

public class Person09 {
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegaAgeException08{ //加了throws就会告诉调用者调用该方法时必须处理异常(丑话说前面)
		if(age>100 || age<0){
			//throw new RuntimeException("年龄不合法"); //此句不用在方法上面写throws
			throw new IllegaAgeException08("年龄不合法。。。");
		}
		this.age = age;
	}

	private int age;
}
