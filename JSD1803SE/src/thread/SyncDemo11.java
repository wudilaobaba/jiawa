package thread;
/**
 * ������̲߳�������ͳһ��Դʱ���γ��ˡ������ľ��棬�����߳��л���ȷ����
 * ���ܻᵼ���̲߳�������Դʱδ���ճ���Ԥ����ִ��˳��ִ�д��룬�����߼����ֻ��ҡ�
 * ����ʱ���ܵ���ϵͳ̱����
 * �����̵߳�ʱ��Ƭ�η���Ĳ�һ�¾ͻ���ɴ�ӡ�������ĸ���
 * ���³��򱨴��������ģ����������ӡ�������ĸ������ͻ�������������
 * @author Administrator
 *
 */
public class SyncDemo11 {
	public static void main(String[] args) {
		Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//��cpu�ó�ʱ�䣬�����л��̣߳�ģ���߳��л�
					System.out.println(getName()+":"+bean); //�߳��л�ȡ�Լ��̵߳�����
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//��cpu�ó�ʱ�䣬�����л��̣߳�ģ���߳��л�
					System.out.println(getName()+":"+bean); //�߳��л�ȡ�Լ��̵߳�����
				}
			}
		};
		t1.start();
		t2.start();
	}
}

class Table{
	//һ����������20������
	private int beans = 20;   //ע��01.��beans����1��ʱ��
	public int getBean(){
		if(beans == 0){
			throw new RuntimeException("û�ж�����");
		}//ע��02.t1�߳�ִ�е�����ó�cpuʱ�䣬��ʱt2��ʼ����table.getBean()����(��"ע��01")
		Thread.yield();//��cpu�ó�ʱ�䣬***����һ�����л��̣߳��п�����һ�λ��ǰ�ʱ��Ƭ�θ�t1 ,���ԾͲ���100%����ִ��Ҳ����100%������ִ��  ģ���߳��л�
		//ע��04.����һ��������ǣ��������߳�ͬʱ����һ��ִ�У���ôbeans�ͻ�����Σ�Ҳ����ִ�ӡ�ฺֵܶ������
		return beans--; //ע��03.t2ִ�е����ʱ��beans������0,��ʱ������43��t1δ��ɵĲ��֣���ʱt1������-1(��"ע��02")
	}
}