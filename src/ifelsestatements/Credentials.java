package ifelsestatements;

import java.util.Scanner;

public class Credentials {
	public static void main(String[]args) {
	 String username="test";
	 String password="test123";
	 //write code that takes username and password from user on console
	 //Check if both username and password are matching,if matching
	 //print "welcome,%username!!!"
	 //if username is correct but password is incorrect print "password incorrect"
	 //if username is incorrect but password is correct print"username is correct"
	 //else print invalid credential
	 //!->negative !str.equals(str2);
	 Scanner input=new Scanner(System.in);
	 System.out.println("Please enter your username:");
	 String enteredUsername=input.nextLine();
	 System.out.println("Please enter your password:");
	 String enteredPassword=input.nextLine();
	 
	       if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
		        System.out.println("Welcome," + enteredUsername + "!!!");
	 }
		 else if (enteredUsername.equals(username) && !enteredPassword.equals(password)) {
			 System.out.println("Invalid password");
	 }
		 else if(!enteredUsername.equals(username) && enteredPassword.equals(password)){
			 System.out.println("Invalid username");
		 }
	       else {
	    	   System.out.println("Invalid Credentials");
	       
	 
	       }
     }
}
