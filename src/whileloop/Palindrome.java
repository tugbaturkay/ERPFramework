package whileloop;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word=input.nextLine();
		String reverse = "";
		
		for(int i=word.length()-1;i>=0;i--) {
			reverse= reverse + word.charAt(i);		//reverse+=word.charAt(i);
		}
			
		System.out.println(reverse);
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
