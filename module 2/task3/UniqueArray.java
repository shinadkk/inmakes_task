package task3;

import java.util.Arrays;
import java.util.Scanner;

// 5.Write A Java Program to Remove Duplicate Elements in an Array
public class UniqueArray 
{
	public static void main(String[] args) 
	{
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }
	        Arrays.sort(array);
	        int[] uniqueArray = removeDuplicates(array);
	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));

	}

	private static int[] removeDuplicates(int[] array) 
	{
		if (array.length == 0) {
            return array;
        }

        int[] tempArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempArray[j++] = array[i];
            }
        }
        tempArray[j++] = array[array.length - 1];
        int[] uniqueArray = Arrays.copyOf(tempArray, j);
        return uniqueArray;
	}

}
