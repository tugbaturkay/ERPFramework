package whileloop;

import java.util.Scanner;

public class CharAppears {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word=input.nextLine().toLowerCase();
		System.out.println("Please enter a character:");
		char c=input.next().toLowerCase().charAt(0);
		System.out.println(word);
		System.out.println(c);
		int counter=0;
		
		for(int i=0; i<word.length(); i++) {
			if(c==word.charAt(i)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
