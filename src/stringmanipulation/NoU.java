package stringmanipulation;

import java.util.Scanner;

public class NoU {
public static void main(String[] args) {
	System.out.println("Please enter your message");
	
	Scanner input=new Scanner(System.in);
	String message=input.nextLine().toLowerCase();

	if (message.contains("u")) {
	     String newMessage=message.replace("u","");
	     System.out.println(newMessage);
		
	}
	else {
		System.out.println(message);
		
		//String message=input.nextLine();
		//message=message=replace("u","");
		//message=message.replace("U","");
		//System.out.println(message);
}
}
}
