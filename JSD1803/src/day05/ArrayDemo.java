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
		
		//��������(���Ƽ�)
//		int[] a = {1,2,55,10,3,920};
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
		
		//ð������(���ԭ��)
		int[] arr = {5,2,66,3,20,15,52,36};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0; j<arr.length-1-i; j++){//һ��֮��Ҫ�Ƚ�arr.length-1-i��
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
		
		//��д����ϰ�������һ��10������������arr�����俽����arr2,����Сֵ����arr2�ĵ�һ��Ԫ���ϡ�������Ԫ���ظ�(������)
		//��д����װһ�����������س���Ϊn�����飬�������е�ÿ��Ԫ����0~max֮��
	}
}
