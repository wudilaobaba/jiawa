package day05;
import java.util.Arrays;
public class ArrayDemo {

	public static void main(String[] args) {
		
		//1/1+1/2+1/3+...+1/15 = ?
//		double sum = 0;
//		for(int i =1;i<=15;i++){
//			sum+=1.0/i;
//		}
//		System.out.println(sum);
		
//		int[] arr = {1,2,3,4,5,6};
//		int[] arr2 = new int[6];
//		System.arraycopy(arr, 0, arr2, 0, arr.length);
//		for(int i=0;i<arr2.length;i++){
//			System.out.println(arr2[i]);
//		}
		
		System.out.println();
//		int[] a1 = {1,2,3};
//		a1 = Arrays.copyOf(a1,a1.length+1);
//		for(int i=0;i<a1.length;i++){
//			System.out.println(a1[i]);
//		}
		
//		int[] arr = {44,5,232,58,26,2,1,55};
//		int max = arr[0];
//		for(int i=1;i<arr.length;i++){
//			if(arr[i]>max){
//				max=arr[i];
//			}
//		}
//		arr = Arrays.copyOf(arr, arr.length+1);
//		arr[arr.length-1] = max;
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
		
		//数组排序(最推荐)
//		int[] a = {1,2,55,10,3,920};
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
		
		//冒泡排序(理解原理)
		int[] arr = {5,2,66,3,20,15,52,36};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0; j<arr.length-1-i; j++){//一轮之中要比较arr.length-1-i次
				if(arr[j]>arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//必写：练习随机生成一个10个整数的数组arr，将其拷贝给arr2,将最小值放在arr2的第一个元素上。不考虑元素重复(别扩容)
		//必写：封装一个方法，返回长度为n的数组，且数组中的每个元素在0~max之间
	}
}
