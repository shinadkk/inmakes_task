package task3;
//1. Write A Java Program for Binary Search Using Array
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
		public static int binarySearch(int[] array, int key) 
		{
	        int low = 0;
	        int high = array.length - 1;
	        while (low <= high) 
	        {
	            int mid = low + (high - low) / 2;
	            if (array[mid] == key)
	            {
	                return mid;
	            }
	            if (array[mid] < key) 
	            {
	                low = mid + 1;
	            }
	            else {
	                high = mid - 1;
	            }
	        }
	        return -1;
	    }
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size");
		int i=sc.nextInt();
		int []arr=new int[i];
		System.out.println("enter array elements");
		{
			for (int l=0;l<arr.length;l++)
			{
				arr[l]=sc.nextInt();
			}
		}
		Arrays.sort(arr);
		System.out.println("enter element to find");
		int j=sc.nextInt();
		
		int k=binarySearch(arr, j);
		if (k==-1)
			{
			System.out.println("element not found");
			}
		else
		System.out.println("element found at location "+k);

	}

}
