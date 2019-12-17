package stringmanipulation;

import java.util.Scanner;

public class FirstLetter {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		name=name.toLowerCase().trim();
		
		if (name.isEmpty()) {
			System.out.println("Invalid entry");
		}else {
			char a=name.charAt(0);
			char b=name.charAt(name.length()-1);
			
			if(a=='a' && b=='z') {
				System.out.println("Cool");
			}
			else {
				System.out.println("Not very cool");
			}
		}
		
		
	}
	

}
