package task4;

import java.util.LinkedList;
import java.util.Scanner;

public class LLInsert 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        
        System.out.println("Current LinkedList is: " + linkedList);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the element to be inserted in LinkedList: ");
        int element = sc.nextInt();

        System.out.print("Enter the position at which the element is to be inserted: ");
        int pos = sc.nextInt();
        
        if (pos >= 0 && pos <= linkedList.size()) 
        {
            linkedList.add(pos, element);
            System.out.println("Element inserted successfully.");
        } 
        else 
        {
            System.out.println("Invalid position. Enter a position between 0 and " + linkedList.size());
        }
        System.out.println("LinkedList after insertion: " + linkedList);
	}

}
