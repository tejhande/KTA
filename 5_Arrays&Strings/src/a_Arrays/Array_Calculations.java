package a_Arrays;

public class Array_Calculations {

	public static void main(String[] args) throws InterruptedException {
		int [] arr;
		
		arr = new int[100];
		for (int i = 0 ; i<arr.length; i++) {
			arr[i] =i+1;
		}
		
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Index "+ (i) +" = ");
			System.out.println(arr[i]);
			Thread.sleep(100);
		}
		System.out.println();
		System.out.println("Sum = "+sum);

	}

}
