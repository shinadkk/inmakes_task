import java.util.Scanner;
class Laptop
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		Laptop l1= new Laptop();
		System.out.println("Enter laptop brand");
		String brand=sc.nextLine();
		System.out.println("Enter laptop ram");
		
		int ram= sc.nextInt();
		l1.name(brand);
		l1.ram(ram);
		
	}

	void name(String brand1)
	{
	System.out.println(brand1+" is the laptop");
	
	}
	void ram(int ram)
	{
	System.out.println(ram+" is the laptop ram");
	
	}









}