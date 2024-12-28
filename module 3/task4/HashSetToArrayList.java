package task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetToArrayList 
{
	public static void main(String[] args) 
	{
		Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("alfa");
        hashSet1.add("bmw");
        hashSet1.add("chevy");
        hashSet1.add("datsun");
        
        System.out.println("HashSet is : " + hashSet1);
        
        List<String> arrayList1 = new ArrayList<>(hashSet1);
        
        System.out.println("ArrayList is : " + arrayList1);
        
        
	}

}
