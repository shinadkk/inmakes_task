package task2;

import java.util.Scanner;

public class RevWords {

		public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
	     	System.out.println("Enter a string: ");
	        String inputString = sc.nextLine();
	        String reversedString = reverseWords(inputString);
	        System.out.println("Reversed string: " + reversedString);
	    }

	    public static String reverseWords(String input) {
	        String result = "";
	        int end = input.length();
	        for (int i = input.length() - 1; i >= 0; i--) {
	            if (input.charAt(i) == ' ') {
	                result += input.substring(i + 1, end) + " ";
	                end = i;
	            }
	        }
	        result += input.substring(0, end);
	        return result;
	    }
	}
	        