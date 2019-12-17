package stringmanipulation;

import java.util.Scanner;

public class IndexPractice {
	public static void main(String[] args) {
		String breed="Huskey";
		int i=breed.indexOf('s');
		System.out.println(i);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your message");
		String message=input.nextLine();
		message=message.toLowerCase().trim();
		
		int a=message.indexOf("heck");
		int b=message.indexOf("silly");
		int c=message.indexOf("idiot");
		
		if(a>0|| b>0 || c>0 ) {
			System.out.println("Message failed");
		}else {
			System.out.println("Message sent");
		}
	}
	

}
