package exception;

public class Person09 {
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegaAgeException08{ //����throws�ͻ���ߵ����ߵ��ø÷���ʱ���봦���쳣(��˵ǰ��)
		if(age>100 || age<0){
			//throw new RuntimeException("���䲻�Ϸ�"); //�˾䲻���ڷ�������дthrows
			throw new IllegaAgeException08("���䲻�Ϸ�������");
		}
		this.age = age;
	}

	private int age;
}
