package loops;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a word");
		String word=input.nextLine();
	
		for(int i=word.length()-1; i>=0;i--) {
			char c=word.charAt(i);
			System.out.print(c);
			//String wordReversed=
		}
		
	}

}
