package ioc2;

public class Restrarant {
	private Waiter wt;
	public Restrarant(){
		System.out.println("Restrarant()");
	}
	public void setWt(Waiter wt) {
		System.out.println("setWt()");
		this.wt = wt;
	}
	@Override
	public String toString() {
		return "Restrarant [wt=" + wt + "]";
	}
	
	
}
