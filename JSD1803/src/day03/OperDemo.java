package day03;
//���������ʾ
public class OperDemo {

	public static void main(String[] args) {
		//++����ʹ��ʱ(һ����ֻ��a++��++a)����ǰ�ں��޲��
		int a = 5 , b = 5;
		a++;
		++b;
		System.out.println(a);
		System.out.println(b);
		
		//++��ʹ��ʱ(һ��֮�г���a++��++a������������)����ǰ�ں��в��
		int c = 5, d = 5;
		int e = c++;
		int f = ++d;
		System.out.println(e);
		System.out.println(f);
		
		//�ۺ�ʹ��++
		int n = 5 , m = 5;
		System.out.println(n++);//5
		System.out.println(n);//6
		System.out.println(++m);//6
		System.out.println(m);//6
		
		
		//�߼�����Ķ�·++
		int g = 5, h = 10, k = 5;
		boolean b1 = g>h && k++>2;
		System.out.println(b1);
		System.out.println(k);
		
		//����ɯ
		System.out.println(""+10+20+30);
		
		//��Ŀ
		int aa = 100;
		int dd = aa>10?10:aa<2?2:aa==20?20:-1;
		System.out.println(dd);
		
		//ȡ�����е����ֵ
		int nn = 200, mm = 50, kk=3;
		int r = nn>mm?nn:mm>kk?mm:kk;
		System.out.println(r);
	}

}
