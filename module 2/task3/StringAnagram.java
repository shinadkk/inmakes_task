package task3;

import java.util.Arrays;
import java.util.Scanner;

//6.. How To Check Whether Two String Are Anagram or not
public class StringAnagram 
{
	public static void main(String[] args) 
	{
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String str1 = sc.nextLine();
	        System.out.print("Enter the second string: ");
	        String str2 = sc.nextLine();
	        if (areAnagrams(str1, str2)) {
	            System.out.println("The strings are anagrams.");
	        } 
	        else
	        {
	            System.out.println("The strings are not anagrams.");
	        }


	}

	private static boolean areAnagrams(String str1, String str2) 
	{
		str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length())
        {
            return false;
        }
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);;
        return Arrays.equals(array1, array2);
	}

}

