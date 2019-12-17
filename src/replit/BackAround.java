package replit;

import java.util.Scanner;

public class BackAround {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String word=input.nextLine();
		
		char c=word.charAt(word.length()-1);
		System.out.println(c);
		System.out.println(c+word+c);
	}

}
