package task2;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String input=sc.nextLine();
		input = input.toLowerCase();
	    int count = 0;
	    for (int i = 0; i < input.length(); i++) {
	    	char c = input.charAt(i);
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                count++;
	            }
	        }
	    System.out.println("Number of vowels in the string: " + count);
	}
}
