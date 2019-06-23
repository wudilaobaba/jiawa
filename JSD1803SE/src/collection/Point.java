package collection;
/**
 * ���õ�ǰ����Ϊ����Ԫ�أ����Լ��ϲ���Ԫ�ص���ط���
 * @author Administrator
 * ������ʵ��Comparable�ӿڣ���ôһ��Ҫ���Ϸ��ͣ�����дcompareTo����
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof Point){
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
		}
		return false;
	}
	public String toString(){
		return "("+x+","+y+")";
	}


	/**
	 * ��һ����ʵ����Comparable�ӿں�Ҫ�������д���󷽷�compareTo,�÷������������ڶ��嵱ǰ����this�뷽��
	 * ������������o�Ĵ�С��ϵ��
	 * �÷�������һ��intֵ�����ڱ�ʾ�ȽϽ������ֵ����ע����ȡֵ��ֻ��עȡֵ��Χ��
	 * ������ֵ>0ʱ����ʾ��ǰ����this���ڲ�������o
	 * ������ֵ<0ʱ��this<o
	 * ������ֵ=0ʱ��this==o
	 * һ�㲻��ô�ã��������������
	 */
	public int compareTo(Point p){
		return (this.x*this.x + this.y*this.y) - (p.x*p.x+p.y*p.y);
	}
}
