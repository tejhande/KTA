package a_Arrays;
//Indexing starts from 0 in Arrays and Strings both
public class Arrays_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Declare Array
		int[] arr;
		
//		Allocation
		arr = new int[5];
		
//		Initialization
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		arr[4] =5;
		
		
//		Declaration , allocation and initialization together
		int [] arr1 = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]);
		}
		Thread.sleep(2000);
		System.out.println();
		for(int i=0; i<10; i++) {
			System.out.print(arr1[i]);				
		}

	}

}