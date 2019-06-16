package collection;

public class Type11<X,Y> { //E不能是基本类型，要用包装类
	private X x;
	private Y y;
	
	public Type11(X x, Y y) {
		super();
		this.x = x;
		this.y = y;
	}
	public X getX() {
		return x;
	}
	public void setX(X x) {
		this.x = x;
	}
	public Y getY() {
		return y;
	}
	public void setY(Y y) {
		this.y = y;
	}
	
	
}
