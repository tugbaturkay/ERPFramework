package casting;

import java.util.Scanner;

public class ExclamationUpper {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your message:");
		String message=input.nextLine();
		
		char first=message.charAt(0);
		char last=message.charAt(message.length()-1);
		
	    if(first>=65 && first<=90 && last==33 || first>=65 && first<=90 && last==46) {
	    	System.out.println("Message is valid");
	    }else {
	    	System.out.println("Message is invalid");
	    }
	}

}
