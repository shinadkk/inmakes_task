//3
import java.util.Scanner;  
public class Average
{  
	public static void main(String[] args)  
	{  
		int count = 1;   
		float  x, average, sum = 0;   
		Scanner sc = new Scanner(System.in);      
		while (count <= 5)   
		{
			System.out.println("Enter number "+count);    
			x = sc.nextInt();  
			sum += x;   
			++count;   
		}   
		average = sum/5;   
		System.out.println("The Average of given five numbers is "+average);  
	}    
}  