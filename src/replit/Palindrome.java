package replit;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String word=scanner.nextLine();
		String result="";
		for (int i=word.length()-1;i>=0;i--) {
			char c=word.charAt(i);
			result+=c;
		}
		if(word.equals(result)){
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
				
		
	}

}
