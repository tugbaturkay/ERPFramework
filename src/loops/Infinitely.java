package loops;

import java.util.Scanner;

public class Infinitely {
	//write a program that asks users infintely;
	//if user enter "hi" your answers "hello", if user enter "bye" your program says"good bye"
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		
		System.out.println("Say your message");
		
		for(; ;) {
			
			String message=input.nextLine();	
			
		if(message.equalsIgnoreCase("hi")) {
			
			System.out.println("Hello");
		}
		else //if (message.equals("bye")) 
			{
			System.out.println("Good bye");
		}
		}
		
		
	}

}
