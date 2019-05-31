package thread;
/**
 * 多并发存在的问题：如下两个线程同时取钱，容易取多了
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
	
	public int getAccount(){ //现有的总存款
		return 50000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
