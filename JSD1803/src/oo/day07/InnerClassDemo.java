package oo.day07;
//��Ա�ڲ������ʾ
public class InnerClassDemo {
	
	public static void main(String[] args) {
		Mama mama = new Mama();
		//Baby baby = new Baby(); //�������
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
			//System.out.println(this.name);//�����this����Baby�Լ���name,��������û��name,���Ա���
		}
	}
}