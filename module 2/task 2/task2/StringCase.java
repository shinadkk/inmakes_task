package task2;

import java.util.Scanner;

public class StringCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString=sc.nextLine();
		String uppercase=toUpperCase(inputString);
		String lowercase=toLowerCase(inputString);
		System.out.println("Upper case is : "+uppercase);
		System.out.println("Lower case is : "+lowercase);
	}
	public static String toUpperCase (String input) {
		String result="";
		for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } 
            else {            
                result += c;
            }
        }
		return result;
		
	}
	public static String toLowerCase (String input) {
		String result="";
		for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c +32);
            } 
            else {            
                result += c;
            }
        }
		return result;
		
	}
}
