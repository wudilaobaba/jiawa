package thread;
/**
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ǰ���¾�������߲���Ч��
 * ͬ������Ը���׼�Ŀ�����Ҫͬ�����еĴ���Ƭ�Ρ�
 * synchronized(ͬ��������){
 * 	 ��Ҫͬ�����еĴ���Ƭ��
 * }
 * 
 * ͬ����������java�������һ������ֻҪ��֤����߳̿����ĸö�����"ͬһ��",���ɱ�֤ͬ�����еĴ����ǲ�����ȫ�ġ�
 * @author Administrator
 *
 */
public class SyncDemo13 {
	public static void main(String[] args) {
		Shop shop = new Shop();
		G f = new G();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy(f);
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy(f);
			}
		};
		t1.start();
		t2.start();
	}
}

class G{} //����synchronized���еĲ�����������������߳�һ���������Ǹ�Ψһ�Ķ���

class Shop{
	public void buy(G g){
		Thread t = Thread.currentThread();
		try{
			System.out.println(t.getName()+":�������·�������");
			Thread.sleep(5000);
			
			//��t1�߳�ִ�е������ô�����߳�ִ�е������ʱ��ͻ���ʱ��������t1ִ����synchronized���еĴ��룬�����߳��ټ�������
			//***synchronized�Ĳ���ѡȡ����:���뱣֤�����߳̿������Ǹ�����������ͬһ��
			//***synchronized��һ��Ψһ�Ķ����������ſ��Ա�֤����̷߳��ָö��������ˣ��ͽ�����ʱ����
			//***ֻҪ���ֶ���̲߳��������������synchronized�еĲ���һ������Ψһ�Ķ��󣡣�����
			synchronized(this){ //����ò�����this, ������this����shop,ֻ��shop���������ø÷���
				System.out.println(t.getName()+":�������·�������");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+"���ڽ���");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}