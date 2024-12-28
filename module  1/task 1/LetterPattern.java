//14
import java.util.Scanner;
public class LetterPattern 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the number of rows for the pattern: ");
        	int rows = sc.nextInt();
        	for (int i = rows; i >= 1; i--) 
		{
            		for (int j = 1; j <= rows - i; j++) 
			{
            	    		System.out.print(" ");
           		} 
            		char currentChar = 'A';
            		for (int k = 1; k <= i; k++) 
			{
                		System.out.print(currentChar++ + " ");
            		}
            		System.out.println();
        	}  
    	}
}
