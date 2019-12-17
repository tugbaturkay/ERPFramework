package loops;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		//write a program for the login application.
		//Program should ask for the password.....
		
		Scanner input=new Scanner(System.in);
		int attempts=0;
		for(; ;) {
			System.out.println("Please enter your password:");
			String passWord=input.nextLine();
             attempts++;
		
			if (passWord.equals("secret478")) {
				System.out.println("Welcome to your profile!");
				break;	
			}	
			if(attempts==3) {
			System.out.println("Sorry, your account is locked.Try after 5 hours");
			break;
			}
		}
		
	}
	

}
