package exception;
/**
 * ʹ�õ�ǰ������쳣���׳�
 * @author Administrator
 *
 */
public class Person04 {
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{ //����throws�ͻ���ߵ����ߵ��ø÷���ʱ���봦���쳣(��˵ǰ��)
		if(age>100 || age<0){
			//throw new RuntimeException("���䲻�Ϸ�"); //�˾䲻���ڷ�������дthrows
			throw new Exception("���䲻�Ϸ�");
		}
		this.age = age;
	}

	private int age;
	
}
