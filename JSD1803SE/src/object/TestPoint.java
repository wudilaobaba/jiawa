package object;
/**
 * ����Point��д��Object����
 * @author Administrator
 *
 */
public class TestPoint {
	
	public static void main(String[] args) {
		Point p = new Point(1,2);
		String str = p.toString();
		System.out.println(str);//object.Point@15db9742 �Ǹö���ĵ�ַ��Ϣ��ʵ�ʿ��������岻��
		
		System.out.println(p.toString());
		
		//println�����Ĳ������Ƕ��󣬷��ص��ǲ���ִ��toString()��ķ���ֵ   ǰ��StringBuilder�������������������һ��
		System.out.println(p);
		
		
		Point p2 = new Point(1,2);
		System.out.println(p==p2);//˫���жϵ��ǵ�ַ
		System.out.println(p.equals(p2));//Object�ڲ��ṩ��equals����˫���ڱȽϣ��Ƚϵ�Ҳ�ǵ�ַ��  ----->return this==����obj
	}

}
