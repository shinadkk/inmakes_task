//15
import java.util.Scanner;
public class SqureNumberPattern 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the numbers on one side of the pattern: ");
        	int rows = sc.nextInt();
        	for (int i = rows; i >= 1; i--) 
		{
            		for (int j = 1; j <= rows; j++) 
			{
                		System.out.print(i + " ");
            		}
            		System.out.println();
        	}

    	}
}
