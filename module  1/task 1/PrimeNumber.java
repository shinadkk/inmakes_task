//5
import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[] args)
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the limit: ");
        	int limit = sc.nextInt();
        
        	System.out.println("Prime numbers up to " + limit + " are :");
        	for (int num = 2; num <= limit; num++)
		{
			boolean isPrime = true;
            		for (int i = 2; i <= num/2; i++)
			{
                		if (num % i == 0)
				{
                    			isPrime = false;
                    			break;
                		}
            		}
            		if (isPrime) 
			{
                		System.out.print(num + " ");
            		}
       		}
        

    	}
}
