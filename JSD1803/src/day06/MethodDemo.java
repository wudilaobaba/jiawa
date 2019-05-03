package day06;

public class MethodDemo {

	public static void main(String[] args) {
		String[] arr = {"a"};
		//fun(arr);
		double a = getNum(120,55);
		System.out.println(a);
		
		
		int[] numArr = {3,2,1};
		//冒泡排序
		long a1 = System.currentTimeMillis();
		int[] boudleArr = boudle(numArr);
		long a2 = System.currentTimeMillis();
		System.out.println("冒泡消耗的时间为："+a1+" "+a2);
		for(int i=0;i<boudleArr.length;i++){
			System.out.println(boudleArr[i]);
		}
	} 
	
	//无返回值的方法
//	public static void fun(String[] speak){
//		for(int i=0;i<speak.length;i++){
//			System.out.println(speak[i]);
//		}
//	}
	
	//有返回值的方法
	public static double getNum(int add1,int add2){
		return add1+add2;
	}

	//冒泡排序的方法封装
	public static int[] boudle(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int num = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = num;
				}
			}
		}
		return arr;
	}

}
