package loopPractice;

import java.util.Scanner;

public class UniqueCharacter {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the String");
		String str=input.nextLine();
		str=str.toLowerCase();
		str=str.replace(" ", "");
		String result="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(result.contains(c+"")) {
		 	continue;
				
			}
			result+=c;
			
		}System.out.println(result);
		
	}

}
