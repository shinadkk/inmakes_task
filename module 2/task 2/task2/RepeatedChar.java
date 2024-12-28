package task2;

import java.util.Scanner;

public class RepeatedChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Repeated characters in the string:");
        boolean found = false;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (input.charAt(k) == currentChar) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == currentChar) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(currentChar + ": " + count + " times");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No repeated characters found.");
        }
    }
}