package task3;

import java.util.Arrays;
import java.util.Scanner;

//9.Write A Java Program to Insert a New Element into An Array to the Specified Index 
public class InsertElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the new element to insert : ");
        int newElement = sc.nextInt();
        System.out.print("Enter the index at which to insert the new element : ");
        int index = sc.nextInt();
        int[] newArr = insertElement(arr, newElement, index);
        System.out.println("Array after inserting new element: " + Arrays.toString(newArr));
	}
	
	private static int[] insertElement(int[] arr, int newElement, int index) 
	{
		 	if (index < 0 || index > arr.length) 
		 	{
	            throw new IndexOutOfBoundsException("Invalid index");
	        }
	        int[] newArr = new int[arr.length + 1];
	        for (int i = 0; i < index; i++) 
	        {
	            newArr[i] = arr[i];
	        }
	        newArr[index] = newElement;
	        for (int i = index; i < arr.length; i++) 
	        {
	            newArr[i + 1] = arr[i];
	        }
	        return newArr;
	    
	}

}
