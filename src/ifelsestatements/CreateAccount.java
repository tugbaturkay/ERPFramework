package ifelsestatements;

import java.util.Scanner;

public class CreateAccount {
	public static void main(String[] args) {
	String username1="test";
	String username2="james";
	//write a code that asks to create username from on console.
	//Check if entered username already exists in the database.
	//if entered username already exists print "username taken" else "username created!"
	
	Scanner input= new Scanner(System.in);
	System.out.println("Please create a username:");
	String enteredUsername=input.nextLine();
	
	if (enteredUsername.equals(username1) || enteredUsername.equals(username2)) {
		System.out.println("username taken");
	}
	else {
		System.out.println("username created!");
		//ask user to enter a password to create
		//check the entered password if length is btw 5 and 12
		//if not give proper message to user and dont create password
		System.out.println("Please create a password:");
		String password=input.nextLine();

		   if(password.length()>=5 && password.length()<=12){
			   System.out.println("password created!");
			   System.out.println("Congratulations, account is created succesfully");
			   System.out.println("username: " + enteredUsername);
				System.out.println("password: " + password);
			   
		   }
		   else{
			   System.out.println("Invalid password. Please enter length between 5 and 12");
		   }
		
	
	}
	System.out.println("\nEnd of Program");
	

	}

}
