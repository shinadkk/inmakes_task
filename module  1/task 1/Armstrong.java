//4
import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args)
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the number: ");
        	int number = sc.nextInt();
        	int x = number;
        	int y = 0;
        	while (x != 0)
		{
        		x /= 10;
            		y++;
        	}
        	x = number;
        	int armstrongSum = 0;
        	while (x != 0)
		{
            		int digit = x % 10;
            		armstrongSum += Math.pow(digit, y);
            		x /= 10;
        	}
        	if (armstrongSum == number)
		{
            		System.out.println(number + " is an Armstrong number");
        	}
		else
		{
            		System.out.println(number + " is not an Armstrong number");
        	}
        

    	}
}
