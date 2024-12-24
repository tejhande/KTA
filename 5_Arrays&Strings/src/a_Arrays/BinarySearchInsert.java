package a_Arrays;
import java.util.Scanner;

public class BinarySearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevent overflow
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1; // Move to the right half
            } else {
                high = mid - 1; // Move to the left half
            }
        }
        return low; // Position to insert the target
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int n = scanner.nextInt();

        // Input the sorted array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input the target value
        int target = scanner.nextInt();

        // Perform binary search and output the result
        System.out.println(searchInsert(nums, target));

        scanner.close();
    }
}
