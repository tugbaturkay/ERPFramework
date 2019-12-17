package loops;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your name:");
	String name=input.nextLine();
	
	for(int i=0; i<15; i++) {
		System.out.println("Welcome " + name);
	}
	

	
}
}
