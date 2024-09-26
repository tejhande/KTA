package a_Arrays;

import java.util.Arrays;

public class Array_For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;

		arr = new int[25];
		for (int i = 0; i < arr.length; i++) {
			int b = (int) (Math.random() * 100);
			arr[i] = b;
//			System.out.println(b);
		}

		System.out.print("Before sort: ");
		for (int i : arr) {
			int a = 0;
			System.out.print(i + " ");
		}

		System.out.println();
		Arrays.sort(arr);
		System.out.print("After sort: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("Found at index: " + Arrays.binarySearch(arr, 65));

	}

}
