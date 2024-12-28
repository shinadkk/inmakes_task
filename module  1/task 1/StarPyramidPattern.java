import java.util.Scanner;
public class StarPyramidPattern 
{
   	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the number of rows for the pyramid: ");
        	int rows = scanner.nextInt();
        	for (int i = rows; i >= 1; i--) 
		{
            		for (int j = 1; j <= rows - i; j++) 
			{
                		System.out.print(" ");
            		}
            		for (int k = 1; k <= 2 * i - 1; k++) 
			{
                		System.out.print("*");
            		}
            	
            		System.out.println();
        	}
    	}
}
