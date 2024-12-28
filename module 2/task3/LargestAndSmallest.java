package task3;
//2. How To Find Third Largest and Second Smallest Element in An Array
import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallest 
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the array size");
		int n=scn.nextInt();
		int []arr=new int[n];
		System.out.println("enter array elements");
		{
			for (int i=0;i<arr.length;i++)
			{
				arr[i]=scn.nextInt();
			}
		}
        if (arr.length < 3) {
            System.out.println("Array should have at least 3 elements");
            return;
        }
        Arrays.sort(arr);
        int secondSmallest = arr[1];
        int thirdLargest = arr[arr.length - 3];
        System.out.println("Second smallest element is: " + secondSmallest);
        System.out.println("Third largest element is: " + thirdLargest);

	}

}
