package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ���������ã�
 * 1.�����߳�����
 * 	 ÿ���̶߳���ռ�ý��̵�һ�����ڴ棬�߳��������࣬�ᵼ����Դ���Ĵ����������̶߳��ǲ������У���ô������߳�Ҳ�ᵼ��CPU�����л������²���Ч�ʱ�
 * 2.�����߳�
 *   Ƶ���Ĵ��������̻߳���̵߳��ȴ�������������ҲӦ�������߳�
 * @author Administrator
 *
 */
public class ThreadPoorDemo19 {
	/*
	 * ����ģʽ
	 * ����ģʽ
	 */
	//�̶���С�̳߳�,�����ڹ�������վ���߳����������ٻ�������ִ�м���Ҫִ�е��߳�����
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);//����ģʽ,��������Ż���һ���߳�
		for(int i=0;i<5;i++){
			Runnable r = new Runnable(){
				public void run(){
					Thread t = Thread.currentThread();
					try{
						System.out.println(t.getName()+":������������");
						Thread.sleep(5000);
						System.out.println(t.getName()+":�����������");
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			};
			//������ָ�ɸ��̳߳�
			System.out.println("������ָ�ɸ��̳߳�");
			threadPool.execute(r);
		}
		threadPool.shutdownNow();//�������̳߳��е��߳���������ͣ��
//		threadPool.shutdown(); //ֹͣ�̳߳صķ�����ֻҪ���������ֹͣ
	}

}
