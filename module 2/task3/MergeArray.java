package task3;
//3. Write A Java Program How to Merge Two Arrays
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray 
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n1=scn.nextInt();
		int []arr1=new int[n1];
		System.out.println("Enter First array elements");
		{
			for (int i=0;i<arr1.length;i++)
			{
				arr1[i]=scn.nextInt();
			}
		}
		
		System.out.println("Enter the size of second array");
		int n2=scn.nextInt();
		int []arr2=new int[n2];
		System.out.println("Enter second array elements");
		{
			for (int j=0;j<arr2.length;j++)
			{
				arr2[j]=scn.nextInt();
			}
		}
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) 
	{
		 	int length1 = arr1.length;
	        int length2 = arr2.length;
	        int[] mergedArray = new int[length1 + length2];
	        System.arraycopy(arr1, 0, mergedArray, 0, length1);
	        System.arraycopy(arr2, 0, mergedArray, length1, length2);
	        return mergedArray;
	}

}
