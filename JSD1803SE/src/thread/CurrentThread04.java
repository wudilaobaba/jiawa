package thread;
/**
 * �߳��ṩ��һ����̬����:
 * static Thread currentThread()
 * �÷������Ի�ȡ���и÷������߳�
 * @author Administrator
 *
 */
public class CurrentThread04 {
	public static void main(String[] args) {
//		Thread t1 = new Thread(new Runnable(){
//			public void run(){
//				for(int i=0;i<1000;i++){
//					System.out.println("����˭��");
//				}
//			}
//		});
//		t1.start();
		Thread main = Thread.currentThread();
		System.out.println("����main�������߳��ǣ�"+main);
		//[main,         5,             main]
		 //�߳���                  �߳����ȼ�                           �߳���  
		//java�б������ַ�������ƴ�ӣ�Ĭ�ϵ��ö����toString����
		dosome();
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread(); //����run�������߳���25�е�t,���Ը��е�t����25�е�t
				System.out.println("--->"+t);
				dosome();  //����dosome�������߳���25�е�t
			}
		};
		t.start();
	}
	
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("����dosome�������߳��ǣ�"+t);
	}

}
