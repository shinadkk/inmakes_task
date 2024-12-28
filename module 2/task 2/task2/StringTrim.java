package task2;

import java.util.Scanner;

public class StringTrim {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String input=sc.nextLine();
		String trimed = trim(input);
		System.out.println("String after removing first and last character: " + trimed);

	}

	private static String trim(String input) {
		 if (input.length() < 2) {
	            return "";
	        }
	        int len = input.length();
	        return input.substring(1, len - 1);
	}

}
