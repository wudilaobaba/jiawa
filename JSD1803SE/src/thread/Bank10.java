package thread;
/**
 * �ಢ�����ڵ����⣺���������߳�ͬʱȡǮ������ȡ����
 * @author Administrator
 *
 */
public class Bank10 {
	public boolean getMoney(int money){
		int account = getAccount();
		if(account>=money){
			account = account-money;
			saveAccount(account);
			return true;
		}
		return false;
	}
	public void saveAccount(int account){
		
	}
	
	public int getAccount(){ //���е��ܴ��
		return 50000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
