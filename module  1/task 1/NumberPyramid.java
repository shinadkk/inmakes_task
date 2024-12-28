import java.util.Scanner;
public class NumberPyramid 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the number of rows for the Pyramid: ");
        	int rows = sc.nextInt();
        	int numberToPrint = 1;
        	for (int i = 1; i <= rows; i++) 
		{
            		for (int k = 1; k <= i; k++) 
			{
                		System.out.print(numberToPrint + "   ");
                		numberToPrint++;
            		}    
            		System.out.println();
        	}
    	}
}
