//10
import java.util.Scanner;
public class InvertedHalfPyramidPattern 
{
  	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the number of rows for the Inverted half pyramid: ");
        	int rows = sc.nextInt();
        	for (int i = rows; i >= 1; i--) 
		{
            		for (int j = 1; j <= i; j++) 
			{
                		System.out.print(j + " ");
            		}
            	System.out.println();
        	}
    	}
}
