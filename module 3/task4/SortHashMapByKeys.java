package task4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class SortHashMapByKeys 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hashMap1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of entries: ");
        int numberOfEntries = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < numberOfEntries; i++) 
        {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();
            hashMap1.put(key, value);
        }   
        System.out.println("Original HashMap: " + hashMap1);
        TreeMap<String, Integer> sortedMap1 = new TreeMap<>(hashMap1);
        System.out.println("Sorted HashMap by keys: " + sortedMap1);
        
	}
}
