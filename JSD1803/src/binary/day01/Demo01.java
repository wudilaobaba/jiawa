package binary.day01;

public class Demo01 {

	public static void main(String[] args) {
		int n = 51;
		String[] arr = new String[10];
		String[] binArr = new String[100];
		boolean[] flag = new boolean[binArr.length];
		for(int i=0;i<binArr.length;i++){
			binArr[i] = Integer.toBinaryString(i);
			//System.out.println(i+"\t"+binArr[i]);
		}
		for(int i=0;i<10;i++){
			int rand;
			do{
				rand = (int)(Math.random()*(0-(binArr.length-1+1))+(binArr.length-1+1));
			}while(flag[rand]);
			flag[rand] = true;
			arr[i] = binArr[rand];
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println(Integer.toBinaryString(11));
	}

}
