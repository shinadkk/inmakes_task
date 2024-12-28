package task3;

import java.util.Arrays;
import java.util.Scanner;

//8.How To Remove Given Element from An Array in Java?
public class RemoveElement 
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
        System.out.print("Enter the element to remove : ");
        int elementToRemove = sc.nextInt();
        arr = removeElement(arr, elementToRemove);
        System.out.println("Array after removing element : " + Arrays.toString(arr));
	

	}

	private static int[] removeElement(int[] arr, int elementToRemove) 
	{
		int count = 0;
        for (int value : arr) 
        {
            if (value == elementToRemove) 
            {
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int value : arr) 
        {
            if (value != elementToRemove) 
            {
                newArr[index++] = value;
            }
        }

        return newArr;
	}

}
