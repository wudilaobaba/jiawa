package thread;
/**
 * ʹ�������ڲ�����������̴߳�����ʽ
 * @author Administrator
 * *********************** ������Thread���͵Ķ���ſ��Ե���start����  **************
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		//��һ�ִ����߳�:
//		Thread t1 = new Thread(){
//			public void start(){
//				for(int i=0;i<1000;i++){
//					System.out.println("����˭��");
//				}
//			}
//		};
//		t1.start();
//		Thread t2 = new Thread(){
//			public void start(){
//				for(int i=0;i<1000;i++){
//					System.out.println("���ǲ�ˮ���...");
//				}
//			}
//		};
//		t2.start();
		
// ================================================================		
		
		//�ڶ��ִ����߳�
//		Thread t1 = new Thread((Runnable)new Mtwo01(){});
//		Thread t2 = new Thread((Runnable)new Mtwo02(){});
//		t1.start();
//		t2.start();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭��");
				}
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("���ǲ�ˮ���");
				}
			}
		});
		t1.start();
		t2.start();
		
		
		//���������ڲ���
		Test t = new Test(){
			public void x(){
				System.out.println("YYY"); //��д���෽��
			}
		};
		t.x(); // "YYY"
	}
}

class Test {
	public void x(){
		System.out.println("XXX");
	}
}
