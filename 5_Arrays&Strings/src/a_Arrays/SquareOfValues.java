package a_Arrays;

public class SquareOfValues {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  // Start time

    	int [] numbers;
		
    	numbers = new int[1000000];
		for (int i = 0 ; i<numbers.length; i++) {
			numbers[i] =i+1;
		}
        
        for (int number : numbers) {
            System.out.println("Square of " + number + " is " + (number * number));
        }
        
        long endTime = System.currentTimeMillis();  // End time
		System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");
    }
}
