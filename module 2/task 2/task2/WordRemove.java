package task2;

import java.util.Scanner;

public class WordRemove {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString=sc.nextLine();
		System.out.println("Enter the word to br removed");
		String removeString=sc.nextLine();
        int index = inputString.indexOf(removeString);
        if (index == -1) {
        	System.out.println("String after removing '" + removeString + "': " + inputString);
        }
        String result = inputString.substring(0, index) + inputString.substring(index + removeString.length());
        result = result.trim();
        System.out.println("String after removing '" + removeString + "': " + result);
		
		
	}

}
