package object;

public class Demo {
	//��һ����û�����κμ̳е�ʱ�򣬺���Ĭ�ϻ���һ��extends Object
	//�����඼��ʹ��Object������ķ���
	private int age = 10;
	//get set����
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
