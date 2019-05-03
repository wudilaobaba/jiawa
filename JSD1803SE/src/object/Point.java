package object;
/**
 * ʹ�ø��������дObject��ط�����ԭ��
 * �����ʾֱ������ϵ�е�һ����
 * @author Administrator
 *
 */
public class Point {
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
	
	/**
	 * ͨ�����Ƕ�������ʹ��toString����ʱ��Ӧ����д�������
	 * ���ص��ַ�����ʽû�о���Ҫ�󣬿ɽ�Ͻ���ʵ�ʿ����������������ԭ���Ϸ��ص��ַ���Ӧ��������ǰ�����е�������Ϣ
	 */
	/**
	 * ͨ����дtoString����
	 * ע�⣺java�ṩ�����ǵ���������д���÷�����ֻ�������Լ��������ͨ��Ҫ��д
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	
	/**
	 * ��дequals
	 * equals��Ƶ�Ŀ���ǱȽ��������������Ƿ���ͬ
	 * ����ָ���ǵ�ǰ����this�Ͳ�������obj�������Ƿ���ͬ
	 * @param args
	 */
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){
			//����ֻ����һ��
			Point p = (Point) obj;  
			return this.x == p.x && this.y==p.y;
		}
		return false;
	}

	public static void main(String[] args) {
		

	}

}
