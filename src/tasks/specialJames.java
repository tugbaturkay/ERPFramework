package tasks;

import java.util.Scanner;

public class specialJames {
	//write a program that asks the name from the user.
	//if they enter James then ask their last name
	//if their name is not james
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String firstName,lastName;
		System.out.println("What is your name?");
		firstName=input.nextLine();
		
		if (firstName.equals("James")){
			System.out.println("What is your last name?");
			lastName=input.nextLine();

		}
			else {
				lastName="Nobody";
			}
		System.out.println("First name:" + firstName);
		System.out.println("Last name:" + lastName);
			
			
		}
		
	}
	


