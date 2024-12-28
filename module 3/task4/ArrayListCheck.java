package task4;

import java.util.ArrayList;

public class ArrayListCheck 
{
	 
	public static void main(String[] args) 
	{
		 ArrayList<String> arrayList1 = new ArrayList<>();
		 
		 checkIfEmpty(arrayList1);
		 
		 arrayList1.add("Hello");
		 
		 checkIfEmpty(arrayList1);

	}
	public static void checkIfEmpty(ArrayList<String> arrayList1) 
	 {
	        if (arrayList1.isEmpty()) 
	        {
	            System.out.println("The ArrayList is empty.");
	        } 
	        else 
	        {
	            System.out.println("The ArrayList is not empty.");
	        }

	 }
}
