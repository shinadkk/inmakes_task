package task2;

import java.util.Scanner;

public class DigitString {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String input=sc.nextLine();
	
	String digits="";
	for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (Character.isDigit(c)) {
            digits += c+" ";
        }
    }
	 System.out.println("Digits in the string is: " + digits);
	

	}


}
