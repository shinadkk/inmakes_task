//6
import java.util.Scanner;
public class Swap 
{
   	public static void main(String[] args)
	{
        	Scanner sc = new Scanner(System.in);
        
        	System.out.print("Enter the first number: ");
        	int x = sc.nextInt();
               	System.out.print("Enter the second number: ");
        	int y = sc.nextInt();
        	System.out.println("Numbers before swapping: x = " + x + ", y = " + y);       
        	x = x + y;
        	y = x - y;
        	x = x - y;
        	System.out.println("Numbers after swapping: x = " + x + ", y = " + y);
    	}
}
