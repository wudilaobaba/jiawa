package thread;
/**
 * �߳������ִ�����ʽ
 * 1.�̳�Thread����дrun��������run�����ж����߳�Ҫִ�е�����(�׶˾���ֻ�ܵ��̳У��̳���Thread���޷��̳г�����)
 * 2.���������߳�����ʵ��Runnable�ӿڲ���дrun����
 * @author Administrator
 * *********************** ������Thread���͵Ķ���ſ��Ե���start����  **************
 */
public class ThreadDemo02 {
	public static void main(String[] args) {
		//ʵ�����߳�����
		Runnable r1= new MyRunnable1();
		Runnable r2= new MyRunnable2();
		//�����߳�872310
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//��������start�е�run����ͬʱ����
		t1.start(); //t1��start������󣬲�һ�����������������start��Ȼ��t2.start��������
		t2.start();
	}

}


class MyRunnable1 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("����˭��");
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("��ˮ��");
		}
	}
}