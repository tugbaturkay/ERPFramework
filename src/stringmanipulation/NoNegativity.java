package stringmanipulation;

import java.util.Scanner;

public class NoNegativity {
	public static void main(String[] args) {
		
		System.out.println("Please enter your message")	;
		Scanner input=new Scanner(System.in);
		String message=input.nextLine().toLowerCase();
		
		if (message.contains("hate")) {
			String newVersion=message.replace("hate","love");
			System.out.println(newVersion);
			
		}
		else {
			System.out.println(message);
		}
		//2nd way to do without if-else
	}

}
