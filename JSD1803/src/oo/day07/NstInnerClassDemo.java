package oo.day07;
//�����ڲ������ʾ
public class NstInnerClassDemo {

	public static void main(String[] args) {
		//1)������Coo��������(���Ǹ������ڲ���)������û������ ����Doo   
		//2)Ϊ�������ഴ����һ������o1��ֻ�ܴ���һ������
		//3)��������Ϊ����������壬����������г��󷽷�����ô�ڴ˱�����д
		Coo o1 = new Coo(){ //o1��������������Doo����
			
		};
		
		//1)������Coo��������(���Ǹ������ڲ���)������û������ ����Eoo
		//2)Ϊ�������ഴ����һ������o2��ֻ�ܴ���һ������
		//3)��������Ϊ����������壬����������г��󷽷�����ô�ڴ˱�����д
		Coo o2 = new Coo(){ //o2��������������Eoo����
			
		};
		
		
		//����������һ�������ڲ������ new Coo(){} �Ӵ�����
		//��ͨ��Ӵ�������һ�������ڲ���Ҳ������
		
		//�����಻�ܱ�ʵ������ʵ����ʵ�����ͼ̳к���ʵ��������FlyingObject
		
		
		int num = 5;
		Doo o3 = new Doo(){
			void show(){
				System.out.println("show show");
				System.out.println(num);
			}
		};
		o3.show();

	}

}
abstract class Doo{
	abstract void show();
}
abstract class Coo{
	int a = 10;
}