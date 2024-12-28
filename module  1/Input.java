import java.util.Scanner;
class Input
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a= sc.nextInt();
		System.out.println("enter second number");
		int b= sc.nextInt(); 
		int c=a+b;
		System.out.println("sum is "+c);	
	}
}