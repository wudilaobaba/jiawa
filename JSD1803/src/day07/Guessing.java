package day07;
import java.util.Scanner;
public class Guessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//�������5����д��ĸ�ַ�
		char[] initLetterArr = randomNum();
		System.out.println("����������5����д��ĸ:");
		
		//�ܷ֣��´�һ�μ�10��
		int score = 500;
		while(true){
			String input = scan.next().toUpperCase();
			if(input.equals("EXIT")){
				System.out.println("bye");
				break;
			}
			char[] inputArr = input.toCharArray();
			//����check����
			int[] c = check(initLetterArr,inputArr);
			if(c[0]==initLetterArr.length){
				System.out.println("��ϲ�㣬�¶��ˣ������÷�Ϊ��"+score);
				break;
			}else{
				score-=10;
				System.out.println("λ�ö���"+c[0]+"����"+"�ַ�����"+c[1]+"��");
			}
		}
		
	}
	/**
	 *�������5����д��ĸ�ַ�(�����ظ�)
	 * 
	*/
	public static char[] randomNum(){		
		char[] arr = new char[5];
		boolean[] flag = new boolean[26];//��Ϊ���أ�ʵ����ÿ�����ɲ��ظ��������
		for(char i=0;i<5;i++){
			char randomChar;
			do{
				randomChar = (char)(Math.random()*(65 - (65+25+1)) + (65+25+1));
			}while(flag[randomChar-(char)65]);
			flag[randomChar-(char)65] = true;
			arr[i] = randomChar;
		}
		System.out.println(arr);
		return arr;
	}
	
	//ͨ�ò鿴int[]����Ԫ�صķ���
	public static void showCharArrList(int[] arr){
		for(int i=0;i<arr.length;i++){
			int c = arr[i];
			System.out.println(c);
		}
		
	}
	
	/**
	 * ��ȡ��������������ͬ��ĸ�ĸ�����������������ĸ��ͬ��λ��Ҳ��ͬ�ĸ���
	 * @param arr1 ������ɵ�����
	 * @param arr2 �û����������
	 * @return towNumArr
	 */
	public static int[] check(char[] arr1,char arr2[]){
		int[] towNumArr = new int[2];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr1[i]==arr2[j]){
					towNumArr[1]++;//������������ͬ��ĸ�ĸ���
					if(i==j){
						towNumArr[0]++;//������������ĸ��ͬ��λ��Ҳ��ͬ�ĸ���
					}
					break;//***���������Ԫ�ض��ǲ��ظ��ģ����ԣ�һ����ֻҪ����ͬ����ĸ���Ͳ��ټ������±Ƚ��ˣ�ֱ�ӽ�����һ��
				}
			}
		}
		return towNumArr;
	}

}
