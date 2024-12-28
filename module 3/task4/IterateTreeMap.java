package task4;

import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap 
{

	public static void main(String[] args) 
	{
		TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("Banana", 2);
        treeMap1.put("Apple", 5);
        treeMap1.put("Cherry", 3);
        treeMap1.put("Date", 4);
        treeMap1.put("Elderberry", 1);
        
        System.out.println("TreeMap: " + treeMap1);
        
        System.out.println("Iterating TreeMap :");
        for (Map.Entry<String, Integer> entry : treeMap1.entrySet()) 
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

	}

}
