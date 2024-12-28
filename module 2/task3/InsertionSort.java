package task3;
//4. Write A program to sort an Array Using Insertion Sort
import java.util.Scanner;

public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(array);
        insertionSort(array);
        System.out.println("Sorted Array: ");
        printArray(array);
	}

	private static void insertionSort(int[] array)
	{
		int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }	
	}

	private static void printArray(int[] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}

}
