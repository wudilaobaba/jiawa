package collection;
/**
 * ��ѭ�� ��JDK1.5֮���Ƴ���һ������
 * ��ѭ���������������ϻ�����ʹ�õ�
 * ��ѭ���ֳ�Ϊ����ǿforѭ����for each
 * @author Administrator
 *
 */
public class NewForDemo08 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five"};
		/*
		 * ��ѭ���Ǳ������Ͽɣ�������JVM�Ͽɣ��������Ὣ��ѭ�����������Ϊ��ͨforѭ������
		 */
		for(String str : array){
			System.out.println(str);
		}
	}
}
