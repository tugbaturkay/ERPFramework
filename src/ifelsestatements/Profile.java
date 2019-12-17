package ifelsestatements;

import java.util.Scanner;

public class Profile {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a password to create:");
		String password=input.nextLine();
		int lengthofPassword=password.length();
		
		if (lengthofPassword>=5 && lengthofPassword<=12) {
			System.out.println(password + " created!");
			
		}
		else {
			if (lengthofPassword<5) {
				System.out.println("Password length is too short");
			}
			else {
				System.out.println("Password length is too long");
			}
			System.out.println("Try again");
		}
		
	}

}
