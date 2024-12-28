//11
import java.util.Scanner;
public class HollowRectanglePattern 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the number of Rows for the Rectangle: ");
        	int rows = sc.nextInt();
        	System.out.println("Enter the number of Columns for the Rectangle: ");
        	int columns = sc.nextInt();
        	for (int i = 1; i <= rows; i++) 
		{
           		for (int j = 1; j <= columns; j++) 
			{
                		if (i == 1 || i == rows || j == 1 || j == columns) 
				{
                    			System.out.print("*");
               			}
				else 
				{
                    			System.out.print(" ");
                		}
            		}
            		System.out.println();
        	}
    	}
}
