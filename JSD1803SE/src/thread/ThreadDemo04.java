package thread;
/**
 * ��ȡ�߳������Ϣ��һ�鷽��
 * @author Administrator
 *
 */
public class ThreadDemo04 {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		//��ȡ�߳�����
		String name = main.getName();
		System.out.println(name);
		
		//��ȡΨһ��ʶ
		long id = main.getId();
		System.out.println(id);
		
		//��ȡ�̵߳����ȼ�
		
		int priority = main.getPriority();
		
		//�߳��Ƿ����
		boolean islive = main.isAlive();
		
		//�Ƿ����ػ��߳�
		boolean isDaemon = main.isDaemon();
		
		//�߳��Ƿ��ж���  true˵���Ǳ����ն�   false˵������������
		boolean isIntertuped = main.isInterrupted();
		
		main.interrupt();//ǿ����ֹ�߳�,����ûɶ��
		
		System.out.println(isIntertuped);
	}

}
