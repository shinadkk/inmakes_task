package task3;

import java.util.Scanner;

//7.Write A Java program To Print Odd and Even Numbers in An Array
public class OddAndEven 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array are: ");
	        for (int i = 0; i < n; i++) 
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Even numbers in the array are: ");
	        for (int i = 0; i < n; i++) 
	        {
	            if (arr[i] % 2 == 0) 
	            {
	                System.out.print(arr[i] + " ");
	            }
	        }

	        System.out.println("\nOdd numbers in the array: ");
	        for (int i = 0; i < n; i++) 
	        {
	            if (arr[i] % 2 != 0) 
	            {
	                System.out.print(arr[i] + " ");
	            }
	        }

	}

}
