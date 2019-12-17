package replit;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your message:");
	    String message=input.nextLine();
	    String cutMessage=message.substring(3);
	    System.out.println(cutMessage);
	    int i=cutMessage.indexOf('a');
	    System.out.println(i);
	    
	}

}
