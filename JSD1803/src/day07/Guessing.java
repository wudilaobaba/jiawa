package day07;
import java.util.Scanner;
public class Guessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//随机生成5个大写字母字符
		char[] initLetterArr = randomNum();
		System.out.println("请依次输入5个大写字母:");
		
		//总分，猜错一次减10分
		int score = 500;
		while(true){
			String input = scan.next().toUpperCase();
			if(input.equals("EXIT")){
				System.out.println("bye");
				break;
			}
			char[] inputArr = input.toCharArray();
			//调用check方法
			int[] c = check(initLetterArr,inputArr);
			if(c[0]==initLetterArr.length){
				System.out.println("恭喜你，猜对了！！！得分为："+score);
				break;
			}else{
				score-=10;
				System.out.println("位置对了"+c[0]+"个，"+"字符对了"+c[1]+"个");
			}
		}
		
	}
	/**
	 *随机生成5个大写字母字符(不能重复)
	 * 
	*/
	public static char[] randomNum(){		
		char[] arr = new char[5];
		boolean[] flag = new boolean[26];//作为开关，实现了每次生成不重复的随机数
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
	
	//通用查看int[]数组元素的方法
	public static void showCharArrList(int[] arr){
		for(int i=0;i<arr.length;i++){
			int c = arr[i];
			System.out.println(c);
		}
		
	}
	
	/**
	 * 获取：两个数组中相同字母的个数、两个数组中字母相同且位置也相同的个数
	 * @param arr1 随机生成的数组
	 * @param arr2 用户输入的数组
	 * @return towNumArr
	 */
	public static int[] check(char[] arr1,char arr2[]){
		int[] towNumArr = new int[2];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr1[i]==arr2[j]){
					towNumArr[1]++;//两个数组中相同字母的个数
					if(i==j){
						towNumArr[0]++;//两个数组中字母相同且位置也相同的个数
					}
					break;//***两个数组的元素都是不重复的，所以，一轮中只要有相同的字母，就不再继续往下比较了，直接进入下一轮
				}
			}
		}
		return towNumArr;
	}

}
