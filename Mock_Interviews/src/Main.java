// Write a program to count number of prime numbers in array in java
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter the size of array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
            }
            int count = countPrime(arr);
            }


            

    }

