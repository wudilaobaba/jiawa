package oo.day03;
//�������͵�����
public class ArrayDemo {

	public static void main(String[] args) {
		Student[] s = new Student[]{
			new Student("�Ż�",15),
			new Student("̭��",12),
			new Student("����")
		};
		s[0].study();
		s[1].study();
		s[2].study();
		
		s[1] =new Student("����"); 
		s[1] =new Student("����111");//s[1]��ַ��ָ�����仯
		System.out.println(s[1].name);
		
		int[][] arr = new int[3][4];
		arr[1][0] = 12;
		
		
		//��������Ϊnullʱ�Ŀ�ָ���쳣����
		Student zc = new Student("����",12);
		zc = null;
		//System.out.println(zc.name); //�þ䱨����ָ���쳣
		
	}

}
