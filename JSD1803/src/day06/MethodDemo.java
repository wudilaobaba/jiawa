package day06;

public class MethodDemo {

	public static void main(String[] args) {
		String[] arr = {"a"};
		//fun(arr);
		double a = getNum(120,55);
		System.out.println(a);
		
		
		int[] numArr = {3,2,1};
		//ð������
		long a1 = System.currentTimeMillis();
		int[] boudleArr = boudle(numArr);
		long a2 = System.currentTimeMillis();
		System.out.println("ð�����ĵ�ʱ��Ϊ��"+a1+" "+a2);
		for(int i=0;i<boudleArr.length;i++){
			System.out.println(boudleArr[i]);
		}
	} 
	
	//�޷���ֵ�ķ���
//	public static void fun(String[] speak){
//		for(int i=0;i<speak.length;i++){
//			System.out.println(speak[i]);
//		}
//	}
	
	//�з���ֵ�ķ���
	public static double getNum(int add1,int add2){
		return add1+add2;
	}

	//ð������ķ�����װ
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
